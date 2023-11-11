interface searhable{void search();}

class Document implements inter1
{
        public void search(){
            System.out.print("THIS SEARCH FIRST LINE IN DOCUMENT");
        }
    public static void main (String a[])

    {
        Document obj= new Document();
        obj.search();
    }
}


class Webpage implements inter1
{
    public void search()
    {
        System.out.print("THIS SEARCH LAST WORD IN WEBPAGE");

    
    }
    public static void main (String a[])

    {
        Webpage obj= new Webpage();
        obj.search();
    }
}