class DuplicatW{
    public static void main(String[] args) {
        String str="this is duplicate word this is";

        System.out.println("String : " + str);

        str=str.toLowerCase();
        String words[] =str.split(" ");
        int count=1;

       
        for(int i=0; i<words.length; i++){
            count=1;

            for(int j=i+1; j<words.length; j++){
                if(words[i].equals(words[j])){
                    count++;

                    words[j]="0";
                }
            }

            if(count>1 && words[i]!="0"){
                
            System.out.println(words[i]);
            }
        }

    }
}