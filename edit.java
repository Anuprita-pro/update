   try{
MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
DB database = mongoClient.getDB( "sofine" );
System.out.println("Connect to database successfully");
DBCollection coll;
coll=database.getCollection("info");

BasicDBObject Where=new BasicDBObject();
BasicDBObject Set=new BasicDBObject();

//Set.put("id",jTextField4.getText());
Set.put("Name",jTextField1.getText());
Set.put("Mob",jTextField2.getText());
Set.put("Add",jTextField3.getText());
Where.put("Mob",jTextField2.getText());


coll.update(Where,Set);
JOptionPane.showMessageDialog(null,"Record Updated Successfully!!!");
System.out.print("update success");
        }
        catch(Exception ex)
        {
        
           JOptionPane.showMessageDialog(null,"Exception occured :"+ex);
            
        }    
try {
                MongoClient mongoClient = null;
                DBCursor cursor = null;
                mongoClient = new MongoClient( "localhost" , 27017 );
                DB db = mongoClient.getDB( "sofine" );
                DBCollection coll = db.getCollection("info");
                
                
                cursor = coll.find();

                String[] columnNames = {"Name", "Mob", "Add"};
                DefaultTableModel model = new DefaultTableModel(columnNames, 0);

                while(cursor.hasNext()) {
                    DBObject obj = cursor.next();
                    String data1 = (String)obj.get("Name");
                    String data2 = (String)obj.get("Mob");
                    String data3 = (String)obj.get("Add");
                    
                    model.addRow(new Object[] { data1, data2, data3 });
                }
                jTable1.setModel(model);
               }
                    catch(Exception ex)
                        {
                    JOptionPane.showMessageDialog(null,"Exception occured :"+ex);
        }        // TODO add your h    // TODO add your handling code here:
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
 try{
            MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
            DB database = mongoClient.getDB( "sofine" );
            System.out.println("Connect to database successfully");
            DBCollection coll;
            coll=database.getCollection("info");

                BasicDBObject Where=new BasicDBObject();

               Where.put("Mob",jTextField2.getText());
                coll.remove(Where);

                JOptionPane.showMessageDialog(null,"Record Deleted Successfully");
                
                System.out.print("remove success");
                        }
                    catch(Exception ex)
                        {
                    JOptionPane.showMessageDialog(null,"Exception occured :"+ex);
        }     
