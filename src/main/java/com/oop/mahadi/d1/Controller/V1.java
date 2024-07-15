package com.oop.mahadi.d1.Controller;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.oop.mahadi.d1.Model.Person;
import com.oop.mahadi.d1.Utility.AllertShow;
import com.oop.mahadi.d1.Utility.AppendableObjectOutputStream;
import com.oop.mahadi.d1.Demotable;
import com.oop.mahadi.d1.Utility.NameValidator;
import com.oop.mahadi.d1.Utility.NumberValidator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class V1 {

    @FXML
    private TableColumn<Demotable, String> c1;

    @FXML
    private TableColumn<Demotable, String> c10;

    @FXML
    private TableColumn<Demotable, String> c11;

    @FXML
    private TableColumn<Demotable, String> c2;

    @FXML
    private TableColumn<Demotable, String> c3;

    @FXML
    private TableColumn<Demotable, String> c4;

    @FXML
    private TableColumn<Demotable, String> c5;

    @FXML
    private TableColumn<Demotable, String> c6;

    @FXML
    private TableColumn<Demotable, String> c7;

    @FXML
    private TableColumn<Demotable, String> c8;

    @FXML
    private TableColumn<Demotable, String> c9;
    @FXML
    private TableView<Demotable> tableView;

    @FXML
    private TextField id;

    @FXML
    private TextField name;

    @FXML
    private TextField pass;
ArrayList<Person> arrP=new ArrayList<>();
    @FXML
    private DatePicker date;
    @FXML
    private ComboBox<String> com1;

    //    @FXML
//    private TableView<?> tableView;
//Person p;
    @FXML
    void add(ActionEvent event) {
       Person p=new Person();
       if(id.getText().isEmpty()||name.getText().isEmpty()||pass.getText().isEmpty()){
           AllertShow.showAlert("","Your name , id , pass Can not be Empty");
           return;
       }
       if(com1.getValue()==null){

           AllertShow.showAlert("","Please select from Combo box ");
           return;
       }
       if(date.getValue()==null){
           AllertShow.showAlert("","Please Select a date from date picker");

       }

        if(!NameValidator.isValidName(name.getText())){
            return;
        }

        if(!NumberValidator.containsOnlyNumbers(id.getText())){
            return;
        }
        if((id.getText().length()<=5)||(id.getText().length()>=10)){
            AllertShow.showAlert("","Id len must be  between >5 to  <10");
            return;
        }


        if(((pass.getText().isEmpty())||(pass.getText().length()<=6))){
            AllertShow.showAlert(""," \n len of your pass must be >6 \n and pass can not be empty");
            return;
        }

//       System.out.println(id.getText().isEmpty());
        p.setId(Integer.parseInt(id.getText()));
        p.setName(name.getText());
        p.setPassword(pass.getText());
        arrP.add(p);

        try {
            File f = new File("Person.bin");
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;

            if( f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
                //fos = new FileOutputStream(f);
            }
            else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

                oos.writeObject(p);



            oos.close();
            return;
        }
        catch(Exception e){
            //
        }




    }

    @FXML
    void show(ActionEvent event) {
        tableView.getItems().clear();
        FileInputStream fis=null;

        ObjectInputStream ois=null;
        try{
            File f = new File("Person.bin");
            if(f.exists()){
                fis = new FileInputStream(f);
            }
            else{
                AllertShow.showAlert("","File does not exist");

            }
            if(fis != null) ois = new ObjectInputStream(fis);

            while(true) {
                Person p= (Person) ois.readObject();
                String x="";
                tableView.getItems().add(new Demotable(
                        p.getName()+ "",p.getPassword()+"",p.getId()+"",
                        x+ "",x+"",x+"",
                        x+ "",x+"",x+"",
                        x+ "",x+""


                ));
                System.out.println(p.toString());
            }

        }
        catch(Exception e){
            try {
                if (ois != null) ois.close();
            }
            catch(Exception e2){
                //
            }
        }




    }

    @FXML
    void initialize() {
        com1.getItems().add("hello");
        c1.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C1"));
        c2.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C2"));
        c3.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C3"));
        c4.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C4"));
        c5.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C5"));
        c6.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C6"));
        c7.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C7"));
        c8.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C8"));
        c9.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C9"));
        c10.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C10"));
        c11.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C11"));

    }

}
