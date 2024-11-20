Steps to run the application:-

1.	Open Android Studio -> Click on File -> New -> New Project -> Click on Empty Activity -> Give the name to your application -> Click on Finish
2.	The new application opens -> Click on your application name -> app -> src -> main -> res -> layout ->Content_main.xml
3.	In Content_main.xml design your application. Go to Text then take the layout of your choice as per suitable for your application
4.	In the Layout add your components which you need in your application. We took 6 CheckBox and 1 Button as per needed
5.	Give attributes to your components like android:layout_height, android:layout_width, android:id, android:text, android:drawable, etc
6.	To add images to CheckBox use the drawable attribute. The image you want to display add it to the drawable folder
7.	After you finish your designing part  then go to MainActivity.java by clicking on your application name -> app -> src -> main -> java -> MainActivity.java
8.	In MainActivity.java set the id for CheckBox, TextView and Button
9.	Then give code to perform click event on Button by using onClickListener(). To check which CheckBox is selected use the if condition for each CheckBox by using isChecked() method
10.	To display the selected item name and price use the Toast method as follows to display a message-
Toast.makeText(getApplicationContext(), “Message you want to display”, Toast.LENGTH_LONG).show();
11.	After finishing the design and coding part click on “Run” and you will get the desired output

