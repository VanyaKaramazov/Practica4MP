package src;

import java.util.Scanner;

public class ImperioGalacticoShop {

	static Scanner sc = new Scanner(System.in);
	static int presupuesto = 0;
	static int opcionPropulsor;
	static int opcionCabina;
	static int opcionBlindaje;
	static int opcionArma;

	public static void main(String[] args) {
		Controlador controlador = new Controlador();
		
		//Fabricas para cada parte de la nave.
		AbstractFactory fabricaPropulsor =  controlador.getFactory("Propulsor");
	
		AbstractFactory fabricaCabina =  controlador.getFactory("Cabina");
		
		AbstractFactory fabricaBlindaje =  controlador.getFactory("Blindaje");
		
		AbstractFactory fabricaArma =  controlador.getFactory("Arma");
		
		//Pedimos al usuario que nos diga su presupuesto
		System.out.println("Bienvenido a Aeronautica Imperio Galactico" + "\n" + "Ingrese su presupuesto: ");
	    
		while (true) {
	        try {
	            String opcionUser = sc.nextLine();
	            presupuesto = Integer.parseInt(opcionUser);
	            break;
	        } catch (NumberFormatException nfe) { 
	            System.out.println("Por favor ingresa un valor valido \n");
	        }
	    }		
	            
	         
	    disenarNave();
	    
	    //Creamos la nave disenada por el usuario
	    Nave nuevaNave = new Nave(getPropulsor(opcionPropulsor, fabricaPropulsor),getCabina(opcionCabina, fabricaCabina), getBlindaje(opcionBlindaje, fabricaBlindaje),  getArma(opcionArma, fabricaArma));
		nuevaNave.muestraNave();
		
		//Creamos las naves del catalogo
		Nave naveOpcion1 = new Nave(getPropulsor(1, fabricaPropulsor),getCabina(1, fabricaCabina), getBlindaje(1, fabricaBlindaje),  getArma(1, fabricaArma));
		Nave naveOpcion2 = new Nave(getPropulsor(2, fabricaPropulsor),getCabina(2, fabricaCabina), getBlindaje(2, fabricaBlindaje),  getArma(2, fabricaArma));
		Nave naveOpcion3 = new Nave(getPropulsor(3, fabricaPropulsor),getCabina(3, fabricaCabina), getBlindaje(3, fabricaBlindaje),  getArma(3, fabricaArma));
		
		

		
		comprobarPresupuesto(presupuesto, nuevaNave, sc, fabricaArma, fabricaArma, fabricaArma, fabricaArma, naveOpcion1, naveOpcion2, naveOpcion3);
	  
			
		
		
	}
	
	

	/**
	 * Metodo que permite al usuario escojer los componentes de la nave
	 */
	public static void disenarNave() {
		
		//Pedimos que el usuario escoja los propulsores de la nave. 
    	do {
            System.out.println("Elija uno de los siguientes propulsores: \n"+
            				"1 .- Propulsores Intercontinentales $1000 \n" +
                            "2 .- Propulsores Interplanetarios $2000 \n" +
                            "3 .- Propulsores Intergalacticos $3500 \n");
            while (true) {
                try {
                	String opcionUser = sc.nextLine();
                    opcionPropulsor = Integer.parseInt(opcionUser);
                	break;
                } catch (NumberFormatException nfe) { 
                    System.out.println("Por favor elige una opción valida \n" +
                    		"1 .- Propulsores Intercontinentales $1000 \n" +
                            "2 .- Propulsores Interplanetarios $2000 \n" +
                            "3 .- Propulsores Intergalacticos $3500 \n");
                }
            }
    	}while(opcionPropulsor < 1 || opcionPropulsor >3);
            
		
		//Pedimos que el usuario escoja la cabina de la nave.
    	do {
    		System.out.println("Elija una de las siguientes cabinas: \n"+
    				"1 .- Cabina individual $2000 \n" +
                    "2 .- Cabina para tripulacion pequena $2500 \n" +
                    "3 .- Cabina para ejercito $3500 \n");
		    while (true) {
		        try {
		            String opcionUser = sc.nextLine();
		            opcionCabina = Integer.parseInt(opcionUser);
		            break;
		        } catch (NumberFormatException nfe) { 
		            System.out.println("Por favor elige una opción valida \n" +
		            		"1 .- Cabina individual $2000 \n" +
		                    "2 .- Cabina para tripulacion pequena $2500 \n" +
		                    "3 .- Cabina para ejercito $3500 \n");
		        }
		    }
    	}while(opcionCabina < 1 || opcionCabina > 3);
            
            
		
        //Pedimos que el usuario escoja el blindaje de la nave.
    	do {
            System.out.println("Elija uno de los siguientes blindajes: \n"+
            				"1 .- Blindaje Simple $500 \n" +
                            "2 .- Blindaje Reforzado $1000 \n" +
                            "3 .- Blindaje Fortaleza $2000 \n");
            while (true) {
                try {
                    String opcionUser= sc.nextLine();
                    opcionBlindaje = Integer.parseInt(opcionUser);
                    break;
                } catch (NumberFormatException nfe ) { 
                    System.out.println("Por favor elige una opción valida \n" +
                    		"1 .- Blindaje Simple $500 \n" +
                            "2 .- Blindaje Reforzado $1000 \n" +
                            "3 .- Blindaje Fortaleza $2000 \n");
                }
            }
    	}while(opcionBlindaje < 1 || opcionBlindaje > 3);
            
         
            
          //Pedimos que el usuario escoja las armas de la nave.
    	do {
            System.out.println("Elija una de las siguientes armas: \n"+
            				"1 .- Laser simple $400 \n" +
                            "2 .- Misiles Plasma $700 \n" +
                            "3 .- Laser Destructor de Planetas $1000 \n");
            while (true) {
                try {
                    String opcionUser = sc.nextLine();
                    opcionArma = Integer.parseInt(opcionUser);
                    break;
                } catch (NumberFormatException nfe) { 
                    System.out.println("Por favor elige una opción valida \n" +
                    		"1 .- Laser simple $400 \n" +
                            "2 .- Misiles Plasma $700 \n" +
                            "3 .- Laser Destructor de Planetas $1000 \n");
                }
            }
    	}while(opcionArma < 1 || opcionArma > 3);
           
	}
	




	
	/**
	 * Metodo que comprueba que el presupuesto sea suficiente para pagar la nave. De no ser asi, da dos opciones: diselar otra nave o desplegar 
	 * el catologo de naves pre-ensambladas.
	 * @param presupuesto
	 * @param nuevaNave
	 * @param sc
	 * @param fabricaArma
	 * @param fabricaPropulsor
	 * @param fabricaCabina
	 * @param fabricaBlindaje
	 * @param naveOpcion1
	 * @param naveOpcion2
	 * @param naveOpcion3
	 */
	public static void comprobarPresupuesto(int presupuesto, Nave nuevaNave, Scanner sc, AbstractFactory fabricaArma, AbstractFactory fabricaPropulsor, AbstractFactory fabricaCabina, AbstractFactory fabricaBlindaje, Nave naveOpcion1, Nave naveOpcion2, Nave naveOpcion3) {
		int opcion1;
		int opcion2;
		
		if(presupuesto < nuevaNave.getCosto()){
			do {
				System.out.println("El costo de tu nave sobrepasa tu presupuesto. ¿Deseas diseñar otra nave o ver nuestro catálogo? \n"+
	            		"1 .- Disenar otra nave \n" +
	                    "2 .- Mostrar naves pre-ensambladas \n" );
				while (true) {
	                try {
	                    String opcionUser = sc.nextLine();
	                    opcion1 = Integer.parseInt(opcionUser);
	                    break;
	                } catch (NumberFormatException nfe) { 
	                    System.out.println("Por favor elige una opción valida \n" +
	                    		"1 .- Disenar otra nave \n" +
	                            "2 .- Mostrar naves pre-ensambladas \n" );
	                }
	            }
				
				if(opcion1 == 1) {
					disenarNave();
					nuevaNave.muestraNave();
				}else if (opcion1 == 2) {
					System.out.println("Escoja una opcion. \n" + 
										"Catalogo de naves: \n" +
										"1.- Nave individual de combate "+ "$3900" + "\n" +
										"2.- Nave militar de transporte "+ "$5900" + "\n" +
										"3.- Base espacial de guerra "+ "$10000" + "\n" +
										"0.- Salir.\n");
					while (true) {
		                try {
		                    String opcionUser = sc.nextLine();
		                    opcion2 = Integer.parseInt(opcionUser);
		                    break;
		                } catch (NumberFormatException nfe) { 
		                    System.out.println("Por favor elige una opción valida \n" +
		                    		"1.- Nave individual de combate "+ "$3900" + "\n" +
									"2.- Nave militar de transporte "+ "$5900" + "\n" +
									"3.- Base espacial de guerra "+ "$10000" + "\n" +
									"0.- Salir.\n");
		                }
		            }
					if(opcion2 == 1) {
						//Creamos la nave individual de combate.
						naveOpcion1.muestraNave();
					} else if (opcion2 == 2) {
						//Creamos la nave militar de combate.
						naveOpcion2.muestraNave();
					} else if (opcion2 == 3) {
						//Creamos la base espacial de guerra.
						naveOpcion3.muestraNave();
					} else if(opcion2 == 0){
						return;
					}else {
						System.out.println("Por favor elige una opción valida \n" +
	                    		"1.- Nave individual de combate "+ "$3900" + "\n" +
								"2.- Nave militar de transporte "+ "$5900" + "\n" +
								"3.- Base espacial de guerra "+ "$10000" + "\n" +
								"0.- Salir.\n");
						while (true) {
			                try {
			                    String opcionUser = sc.nextLine();
			                    opcion2 = Integer.parseInt(opcionUser);
			                    break;
			                } catch (NumberFormatException nfe) { 
			                    System.out.println("Por favor elige una opción valida \n" +
			                    		"1.- Nave individual de combate "+ "$3900" + "\n" +
										"2.- Nave militar de transporte "+ "$5900" + "\n" +
										"3.- Base espacial de guerra "+ "$10000" + "\n" +
										"0.- Salir.\n");
			                }
			            }
					}
					
					
					}else {
						System.out.println("Por favor elige una opción valida \n" +
		                		"1 .- Disenar otra nave \n" +
		                        "2 .- Mostrar naves pre-ensambladas \n" );
						
						while (true) {
			                try {
			                    String opcionUser = sc.nextLine();
			                    opcion1 = Integer.parseInt(opcionUser);
			                    break;
			                } catch (NumberFormatException nfe) { 
			                    System.out.println("Por favor elige una opción valida \n" +
			                    		"1 .- Disenar otra nave \n" +
			                            "2 .- Mostrar naves pre-ensambladas \n" );
			                }
			            }
					}
			}while(presupuesto < nuevaNave.getCosto());
		} else {
			System.out.println("Pase a pagar la nave");
		}
	}


	/**
	 * Metodo que crea la cabina
	 * @param opcionCabina
	 * @param fabricaCabina
	 * @return
	 */
	
	public static Cabina getCabina(int opcionCabina,AbstractFactory fabricaCabina) {
		if(opcionCabina == 1) {
        	Cabina cabinaNueva1 = (Cabina)fabricaCabina.getComponente("piloto");
			cabinaNueva1.crearCabina();
			return cabinaNueva1;
        } else if (opcionCabina == 2) {
        	Cabina cabinaNueva1 = (Cabina)fabricaCabina.getComponente("tripulacion");
			cabinaNueva1.crearCabina();
			return cabinaNueva1;
        } else if (opcionCabina == 3) {
        	Cabina cabinaNueva1 = (Cabina)fabricaCabina.getComponente("ejercito");
			cabinaNueva1.crearCabina();
			return cabinaNueva1;
        } return null;
		
	}
	
	
	
	/**
	 * Metodo que crea el blindaje
	 * @param opcionBlindaje
	 * @param fabricaBlindaje
	 * @return
	 */
	public static Blindaje getBlindaje(int opcionBlindaje,AbstractFactory fabricaBlindaje) {
		if(opcionBlindaje  == 1) {
        	Blindaje blindajeNuevo1 = (Blindaje)fabricaBlindaje.getComponente("simple");
			blindajeNuevo1.crearBlindaje();
			return blindajeNuevo1;
        } else if (opcionBlindaje == 2) {
        	Blindaje blindajeNuevo1 = (Blindaje)fabricaBlindaje.getComponente("reforzado");
			blindajeNuevo1.crearBlindaje();
			return blindajeNuevo1;
        } else if (opcionBlindaje == 3) {
        	Blindaje blindajeNuevo1 = (Blindaje)fabricaBlindaje.getComponente("fortaleza");
			blindajeNuevo1.crearBlindaje();
			return blindajeNuevo1;
        } return null;
		
	}
	
	
	/**
	 * Metodo que crea los propulsores
	 * @param opcionPropulsor
	 * @param fabricaPropulsor
	 * @return
	 */
	public static Propulsor getPropulsor(int opcionPropulsor,AbstractFactory fabricaPropulsor) {
		if(opcionPropulsor == 1) {
			Propulsor propulsorNuevo1 = (Propulsor)fabricaPropulsor.getComponente("intercontinental");
			propulsorNuevo1.crearPropulsor();
			return propulsorNuevo1;
        } else if (opcionPropulsor == 2) {
        	Propulsor propulsorNuevo1 = (Propulsor)fabricaPropulsor.getComponente("interplanetario");
			propulsorNuevo1.crearPropulsor();
			return propulsorNuevo1;
        } else if (opcionPropulsor == 3) {
        	Propulsor propulsorNuevo1 = (Propulsor)fabricaPropulsor.getComponente("intergalactico");
			propulsorNuevo1.crearPropulsor();
			return propulsorNuevo1;
        } return null;
		
	}
	
	
	
	
	
	/**
	 * Metodo que crea el arma
	 * @param opcionArma
	 * @param fabricaArma
	 * @return
	 */
	public static Arma getArma(int opcionArma,AbstractFactory fabricaArma) {
		if(opcionArma  == 1) {
        	Arma armaNueva1 = (Arma)fabricaArma.getComponente("laser simple");
        	armaNueva1.crearArma();
        	return armaNueva1;
        } else if (opcionArma == 2) {
        	Arma armaNueva1 = (Arma)fabricaArma.getComponente("plasma");
			armaNueva1.crearArma();
			return armaNueva1;
        } else if (opcionArma == 3) {
        	Arma armaNueva1 = (Arma)fabricaArma.getComponente("destructor");
			armaNueva1.crearArma();
			return armaNueva1;
        }return null;
		
	}
	

	
}
