 
 class ConeVolumeCalculator {
    
                public static double calculateVolume(double radius, double height) {
                    return (Math.PI * radius * radius * height) / 3;
                }
            
            public static void main(String[] args) {
            
                    
                    double radius = 5;
                    double height = 10;
            
                    // Calculate the volume of the cone using the method
                    double volume = calculateVolume(radius, height);
            
                    // Print the volume to the console
                    System.out.println("The volume of the cone is: " + volume);
                }
            }