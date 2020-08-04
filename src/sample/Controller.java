package sample;


import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.pojo.User;

import javafx.scene.control.TableColumn;


public class Controller {
    private ObservableList<User> usersData = FXCollections.observableArrayList();

    @FXML
    private TableView<User> tableUsers;

    @FXML
    private TableColumn<User, Double> KiColumn;

    @FXML
    private TableColumn<User, Double> YiColumn;
    @FXML
    private TextField A;
    @FXML
    private TextField B;
    @FXML
    private Button Rnd;
    @FXML
    private Button Finish;
    @FXML
    private Button Stop;
    @FXML
    private Button Clear;
    @FXML
    private Stage primaryStage;

    // инициализируем форму данными
    @FXML
    private void initialize() {
        initData();

        // устанавливаем тип и значение которое должно хранится в колонке
        KiColumn.setCellValueFactory(new PropertyValueFactory<User, Double>("Ki"));
        YiColumn.setCellValueFactory(new PropertyValueFactory<User, Double>("Yi"));

        // заполняем таблицу данными
        tableUsers.setItems(usersData);
    }

    @FXML
    public void ClearText(){
        System.out.println("Clear Clicked!");


        A.clear();
        B.clear();
        usersData.clear();
        usersData.add(new User(1, 0));
        usersData.add(new User(2, 0));
        usersData.add(new User(3, 0));
        usersData.add(new User(4, 0));
        usersData.add(new User(5, 0));
        usersData.add(new User(6, 0));
        usersData.add(new User(7, 0));
        usersData.add(new User(8, 0));
        usersData.add(new User(9, 0));
        usersData.add(new User(10, 0));

    }

    public void Exit(){
        System.out.println("Exit Clicked!");
        Stage primaryStage = (Stage) Stop.getScene().getWindow();
        primaryStage.close();

    }
    public void Random(){
        String ssta="";
        String sstb="";
        double a=0;
        double b=0;

        System.out.println("Random Clicked!");
        while (a==0&&b==0) {
            a = (Math.random() * 31) - 15;
            b = (Math.random() * 31) - 15;
            ssta = Double.toString(a);
            sstb = Double.toString(b);
        }
        A.setText(ssta);
        B.setText(sstb);


    }
    public void Result(){
        double s1 =0;
        double s2 =0;
        double s3 =0;
        double s4 =0;
        double s5 =0;
        double s6 =0;
        double s7 =0;
        double s8 =0;
        double s9 =0;
        double s10 =0;

        usersData.clear();
        String ast = A.getText();
        String bst = B.getText();


        double a = Double.parseDouble(ast);
        double b = Double.parseDouble(bst);



        double r1 = (Math.random() * (101));
        double r2 = (Math.random() * (101));
        double r3 = (Math.random() * (101));
        double r4 = (Math.random() * (101));
        double r5 = (Math.random() * (101));
        double r6 = (Math.random() * (101));
        double r7 = (Math.random() * (101));
        double r8 = (Math.random() * (101));
        double r9 = (Math.random() * (101));
        double r10 = (Math.random() * (101));

        if (r1==0&&a==0&&b==0){
            s1=0;
        }
            else{
                s1=Math.sqrt((Math.pow(Math.cos(r1),2))/(Math.pow(a,2)+Math.pow(b,2))-Math.sin(r1))*(r1+r2+r3+r4+r5+r6+r7+r8+r9+r10);
            s2=Math.sqrt((Math.pow(Math.cos(r2),2))/(Math.pow(a,2)+Math.pow(b,2))-Math.sin(r2))*(r1+r2+r3+r4+r5+r6+r7+r8+r9+r10);
            s3=Math.sqrt((Math.pow(Math.cos(r3),2))/(Math.pow(a,2)+Math.pow(b,2))-Math.sin(r3))*(r1+r2+r3+r4+r5+r6+r7+r8+r9+r10);
            s4=Math.sqrt((Math.pow(Math.cos(r4),2))/(Math.pow(a,2)+Math.pow(b,2))-Math.sin(r4))*(r1+r2+r3+r4+r5+r6+r7+r8+r9+r10);
            s5=Math.sqrt((Math.pow(Math.cos(r5),2))/(Math.pow(a,2)+Math.pow(b,2))-Math.sin(r5))*(r1+r2+r3+r4+r5+r6+r7+r8+r9+r10);
            s6=Math.sqrt((Math.pow(Math.cos(r6),2))/(Math.pow(a,2)+Math.pow(b,2))-Math.sin(r6))*(r1+r2+r3+r4+r5+r6+r7+r8+r9+r10);
            s7=Math.sqrt((Math.pow(Math.cos(r7),2))/(Math.pow(a,2)+Math.pow(b,2))-Math.sin(r7))*(r1+r2+r3+r4+r5+r6+r7+r8+r9+r10);
            s8=Math.sqrt((Math.pow(Math.cos(r8),2))/(Math.pow(a,2)+Math.pow(b,2))-Math.sin(r8))*(r1+r2+r3+r4+r5+r6+r7+r8+r9+r10);
            s9=Math.sqrt((Math.pow(Math.cos(r9),2))/(Math.pow(a,2)+Math.pow(b,2))-Math.sin(r9))*(r1+r2+r3+r4+r5+r6+r7+r8+r9+r10);
            s10=Math.sqrt((Math.pow(Math.cos(r10),2))/(Math.pow(a,2)+Math.pow(b,2))-Math.sin(r10))*(r1+r2+r3+r4+r5+r6+r7+r8+r9+r10);
        }


        usersData.add(new User(r1, s1));
        usersData.add(new User(r2, s2));
        usersData.add(new User(r3, s3));
        usersData.add(new User(r4, s4));
        usersData.add(new User(r5, s5));
        usersData.add(new User(r6, s6));
        usersData.add(new User(r7, s7));
        usersData.add(new User(r8, s8));
        usersData.add(new User(r9, s9));
        usersData.add(new User(r10, s10));

    }

    private void initData() {


    }
}
