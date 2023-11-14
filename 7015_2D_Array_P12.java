 class Matrix{  
    public static void main(String args[]){    
int original[][]={{1,35,40},{24,42,34},{32,43,5}};    
System.out.println("Printing Matrix without transpose:");  
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
System.out.print(original[i][j]+" ");    
}    
System.out.println();    
}    
System.out.println("Printing Matrix After Transpose:");  
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
System.out.print(original[j][i]+" ");    
}    
System.out.println();    
}    
}}  