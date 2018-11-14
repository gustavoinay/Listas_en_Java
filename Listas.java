import java.util.Scanner;

public class Listas{

    public static void main(String[] args) {
       
    ListaEdad p = null;
	ListaEdad q = null;
	
	int edad, opcion = 0;
	Scanner Teclado = new Scanner(System.in);
	
	while(opcion!=10){
		
		System.out.println("\n\n");
		System.out.println("1. Ingresar datos en la lista: ");
		System.out.println("2. Mostrar datos de la lista: ");
		System.out.println("3. Eliminar primer elemento de la lista");
                System.out.println("4. Eliminar ultimo elemento de la lista");
		System.out.println("5. Lista Circular");
                System.out.println("*******************PILAS***************************");
                System.out.println("6. Insertar datos a la pila");
                System.out.println("7. Eliminar datos de la pila");
                System.out.println("*******************COLAS***************************");
                System.out.println("8. Insertar datos a la cola");
                System.out.println("9. Extraer datos de la cola");
                System.out.println("10. Salir");
		System.out.println("Seleccione una opcion: ");
		opcion = Teclado.nextInt();
		
		switch(opcion){
			
			case 1: {
				
				System.out.println("Ingrese su edad: ");
				edad = Teclado.nextInt();
				
				q = new ListaEdad();
				q.dato = edad;
				q.siguiente = p;
				p = q;
				break;
			}//Fin del case 
			
			//Mostrar datos
			case 2: {
                            
                            if(p == null){
                                
                                System.out.println("No hay valores en la lista.");
                            
                            }else{
				
				System.out.println("Datos de la lista: ");
                                System.out.println("\n");
				q = p;
				while(q != null){
					
					System.out.println(q);
					System.out.println(q.dato);
					System.out.println(q.siguiente);
					System.out.println("\t");
					q = q.siguiente;
					
				}//Fin del while
                                
                            }
				break;
			}//Fin del case 2
                        
                        case 3: {
                            
                            if(p == null){
                            
                                System.out.println("No hay elementos para eliminar de la lista ");
                            }else{
                        
                           //q = p.siguiente;
                            //p = q;
                            
                            p = p.siguiente;
                            }
                           break;
                        }// fin del case3
                        
                        case 4: {
                        
                                ListaEdad r = null;
                                q = p;
                                
                                if(p == null){
                                
                                    System.out.println("La lista esta vacia, ingrese registros para eliminar despues ");
                                }else{
                                
                                if(p.siguiente == null){
                                
                                    p = null;
                                }else{
                                
                                while(q != null){
					                                   
                                    if(q.siguiente == null){
                                        
                                        r.siguiente = null;
                                    }else {
                                    
                                        r = q;
                                    
                                    }//fin del if
                                    
                                    q = q.siguiente;
				
					
				}//Fin del while
                               }
                                }  
                                break;
			
		}//Fin case 4  
                        case 5: {
                            
                            if(p == null){
                                
                                System.out.println("No hay valores en la lista.");
                            
                            }else{
				
				System.out.println("Datos de la lista: ");
                                System.out.println("\n");
				q = p;
				while(q != null){
					
					System.out.println(q);
					System.out.println(q.dato);
					System.out.println(q.siguiente);
					System.out.println("\t");
					q = q.siguiente;
                                        
                                        if(q.siguiente == null){
                                        
                                            q.siguiente = p;
                                        
                                        }
					
				}//Fin del while
                                
                            }
                        
                                break;
			
		}//Fin case 5
                        
                        case 6: {
                           
                            
                            System.out.println("Ingrese su edad: ");
				edad = Teclado.nextInt();
				
				q = new ListaEdad();
				q.dato = edad;
				q.siguiente = p;
				p = q;
				break;
			
		}//Fin case 6
                        
                        
                          
                        case 7: {
                           
                          
                             if(p == null){
                            
                                System.out.println("No hay elementos para eliminar de la lista ");
                            }else{
                        
                           //q = p.siguiente;
                            //p = q;
                            
                            p = p.siguiente;
                            
                            }
                           break;
                          
			
		}//Fin case 7
                        
                        case 8: {
                           
                           System.out.println("Ingrese su edad: ");
				edad = Teclado.nextInt();
				
				q = new ListaEdad();
				q.dato = edad;
				q.siguiente = p;
				p = q;
				break;
                          
			
		}//Fin case 8
                        
                        case 9: {
                           
                           
                                ListaEdad r = null;
                                q = p;
                                
                                if(p == null){
                                
                                    System.out.println("La lista esta vacia, ingrese registros para eliminar despues ");
                                }else{
                                
                                if(p.siguiente == null){
                                
                                    p = null;
                                }else{
                                
                                while(q != null){
					                                   
                                    if(q.siguiente == null){
                                        
                                        r.siguiente = null;
                                    }else {
                                    
                                        r = q;
                                    
                                    }//fin del if
                                    
                                    q = q.siguiente;
				
					
				}//Fin del while
                               }
                                }  
                                break;
                          
			
		}//Fin case 9
                        
                        
        
        
            }// fin del switch 
        }// fin del while principal
    } // fin del main
} // fin de la clase