//1. Create a File Object and point to your filepath, which you want to read
File initialFile = new File(new java.io.File("").getAbsolutePath()+"/app/src/main/assets/ab.txt");

//2. Surround the read process with try - catch because a lot things can go wrong, for example File not found
try {
    //3. Create an Input Stream
    InputStream targetStream = new FileInputStream(initialFile);

    //4. Create a Reader for that InputStream
    InputStreamReader is = new InputStreamReader(targetStream);

    //5. Create a StringBuilder
    StringBuilder sb=new StringBuilder();

    //6. Create a BufferedReader to read the file step by step
    BufferedReader br = new BufferedReader(is);

    //7. Create a variable of type String and read the first line and assign it to the variable
    String read = br.readLine();

    //8. Now do this in a while loop, as long as there are lines to read
    while(read != null) {

        //9. The StringBuilder helps to append every new line to existing String object
        sb.append(read);
        read =br.readLine();
    }

    //10. Done! You now have your text in this String variable called "read"
    System.out.println("data of file : "+sb.toString());

} catch (FileNotFoundException e) {
    //Handle errors like when there is no file at this path
    e.printStackTrace();
    
} catch (IOException e) {
    //Or when the file could not be read
    e.printStackTrace();
}