package shapes2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    static int index = 0;
    public static void main(String[] args) {
        String fileName = "shapes.txt";
        Shape[] shapes = new Shape[100];

        System.out.println("------->JAC 444 Assignment 1<------");

        runTask1(fileName, shapes);
        displayShape(shapes);
//
//        runTask2(shapes);
//        displayShape(shapes);
//
//        runTask3(shapes);
    }

    private static void runTask1(String fileName, Shape[] shapes) {
        String s;

        System.out.println("------->Task 1 ... <-------");

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while ((s = br.readLine()) != null) {
                String[] tokens = s.split(",");
                try {
                    switch(tokens[0]) {
                        case "Circle":
                            if(tokens.length == 2) {
                                // Convert string to double
                                double radius = Double.parseDouble(tokens[1]);

                                // Create object
                                shapes[index] = new Circle(radius);
                                index++;
                            }
                            break;

                        case "Triangle":
                            if(tokens.length == 4) {
                                double side1 = Double.parseDouble(tokens[1]);
                                double side2 = Double.parseDouble(tokens[2]);
                                double side3 = Double.parseDouble(tokens[3]);

                                shapes[index] = new Triangle(side1, side2, side3);
                                index++;
                            }
                            break;

                        case "Parallelogram":
                            if(tokens.length == 3) {
                                double width = Double.parseDouble(tokens[1]);
                                double height = Double.parseDouble(tokens[2]);

                                shapes[index] = new Parallelogram(width, height);
                                index++;
                            }
                            break;

                        case "Rectangle":
                            if(tokens.length == 3) {
                                double width = Double.parseDouble(tokens[1]);
                                double length = Double.parseDouble(tokens[2]);

                                shapes[index] = new Rectangle(width, length);
                                index++;
                            }
                            break;

                        case "Square":
                            if(tokens.length == 2) {
                                double side = Double.parseDouble(tokens[1]);

                                shapes[index] = new Square(side);
                                index++;
                            }
                            else{
                                continue; //ignore and continue read a file
                            }
                            break;

                        default:
                            break;
                    }
                } catch (CircleException e) {
                    System.out.println(e.getMessage());
                } catch (TriangleException e) {
                    System.out.println(e.getMessage());
                } catch (ParallelogramException e) {
                    System.out.println(e.getMessage());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.printf("\n%d shapes were created:\n", index);
        //displayShape(shapes);
    }

    private static void runTask2(Shape[] shapes) {
        double minTriPerimeter = 0;
        double maxCirPerimeter = 0;
        int count = index;

        System.out.println("------->Task 2 ... <------");
        for(int i = 0; i < count; i++) {
            if(shapes[i].getClass().getSimpleName().equals("Circle")) {
                if(shapes[i].getPerimeter() >= maxCirPerimeter) {
                    maxCirPerimeter = shapes[i].getPerimeter();
                }
                minTriPerimeter = maxCirPerimeter;
            } else if(shapes[i].getClass().getSimpleName().equals("Triangle")) {
                if(shapes[i].getPerimeter() <= minTriPerimeter ) {
                    minTriPerimeter= shapes[i].getPerimeter();
                }
            }
        }
        for(int i = 0; i < count; i++) {
            if(shapes[i].getClass().getName().contains("Triangle") && minTriPerimeter == shapes[i].getPerimeter()) {
                shapes[i] = null;
            } else if(shapes[i].getClass().getName().contains("Circle") && maxCirPerimeter == shapes[i].getPerimeter()) {
                shapes[i] = null;
            }
        }
    }

    private static void runTask3(Shape[] shapes) {
        double sumParallPerimeter = 0, sumTriPerimeter = 0;

        System.out.println("------->Task 3 ... <-------\n");

        for(Shape shape : shapes) {
            if (shape instanceof Parallelogram & !(shape instanceof Rectangle)) {
                sumParallPerimeter += shape.getPerimeter();
            } else if(shape instanceof Triangle) {
                sumTriPerimeter += shape.getPerimeter();
            }
        }

        System.out.println("Total perimeter of Parallelogram is: " + sumParallPerimeter);
        System.out.println("Total perimeter of Triangle is: " + sumTriPerimeter);
    }

    private static void displayShape(Shape[] shapes) {
        for(Shape s: shapes) {
            if(s != null)
            {
            	System.out.println();
            	System.out.println(s);

            }
               
              
        }
    }
}
