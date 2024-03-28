
package refaccionaria;

import java.util.Scanner;
public class proyecto_new {

        public static void main(String[] args) {
        
      Scanner entrada = new Scanner (System.in); 
        
      String usuario = "";
      int contra = 1233;  int opcPM  = 0 ; int opcPM1 = 0 ; int totldelte = 0;
      int opc= 0; int tractop = 0 ;
      int con=0;  int carr1 = 0; int carr8 = 0 ; int carr11 = 0; int carr21 = 0; int carr28 = 0; int carr35 = 0; int carr42 = 0; int carr49 = 0; int carr56 = 0; int carr63 = 0; int carr70 = 0; int carr77 = 0;
      int opcHE=0; int carr2 = 0;  int carr9 = 0 ; int carr12 = 0 ; int carr22 = 0;  int carr29 = 0;  int carr36 = 0; int carr43 = 0;  int carr50 = 0; int carr57 = 0; int carr64 = 0;  int carr71 = 0; int carr78 = 0;
      int opcCAM=0; int carr3 = 0 ;  int carr10 = 0; int carr13 = 0; int carr23 = 0;  int carr30 = 0; int carr37 = 0; int carr44 = 0; int carr51 = 0; int carr58 = 0; int carr65 = 0; int carr72 = 0;
      int opcTRA=0; int carr4 = 0 ; int totl = 0; int carr14 = 0; int carr24 = 0;  int carr31 = 0; int carr38 = 0; int carr45 = 0;  int carr52 = 0; int carr59 = 0; int carr66 = 0;  int carr73 = 0;
      int opcI=0;   int carr5 = 0 ; int carr15 = 0;  int carr18 = 0; int carr25 = 0;  int carr32 = 0; int carr39 = 0; int carr46 = 0; int carr53 = 0; int carr60 = 0; int carr67  = 0; int carr74 = 0;
      int opcAUT =0; int carr6 = 0 ; int carr16 = 0; int carr19 = 0; int carr26 = 0; int carr33 = 0; int carr40 = 0; int carr47 = 0; int carr54 = 0; int carr61 = 0; int carr68 = 0; int carr75 = 0;
      int opcR=0;    int carr7 = 0 ; int carr17 = 0; int carr20 = 0; int carr27 = 0; int carr34 = 0; int carr41 = 0; int carr48 = 0; int carr55 = 0; int carr62 = 0; int carr69 = 0; int carr76 = 0;
      int opcHV=0;
      //piezas de motor volov
      int bomba1 = 12; int interr = 8 ; int bombacom = 13 ;  int bombacomb = 22 ; int interr2 = 11; int bombacom2 =17 ; int bombaint = 14; int interr3 = 5; int bombacom3 = 24;
      int bombas2 = 8; int sensores2 = 12; int cuerpvalv2 = 17; int bombas3 = 33; int  sensores3= 22;  int cuerpvalv3 = 14;   
      //camiones frenos
      String frenosv = "volvo"; int año = 0; String modelo = "";  String modeloV = "Vnl630"; int totbalatas1 = 0 ; int agcarr = 0 ; String modeloV2 = "Vnl64t-630"; String modeloV3 = "FH-540";
      String frenosU = ""; String frenosu3 = ""; 
      String modeloMr = "freightliner"; String frenosMr= "mercedez" ; String modelomb2= "L1624"; String modelomb3 = "Atego2425";
      String frenosin = "International"; String modeloint = "4700SCD"; String modeloint2 = "4400TORTON "; String modeloint3 = "PROSTAR+";
      //tractores
      int opcusuario = 0; int  bombas1 = 11; int sensores1 = 14; int cuerpvalv = 13; int bandafren3 = 12 ;  int frenhoja3 = 19 ;  int ajustefren3 = 14 ; int arbollevtrac1 = 5; int arbollevtrac2 = 9;  int arbollevtrac3 = 11;  int engranestrack1 = 4; int engranestrack2 = 8; int engranestrack3 = 12; 
      int bandafren = 12; int frenhoja1 = 27;   int ajustefren1 = 19; int bandafren2 = 22;  int frenhoja2 = 12 ;  int ajustefren2 = 14; int cigueñaltrack1 = 12 ; int cigueñaltrack2 = 18; int cigueñaltrack3 = 22 ; int placas1 = 9 ; int  placas2 = 16; int  placas3 = 11;  int embrague1 = 7 ;  int embrague2 = 12 ; 
      int embrague3 = 22 ; int transm1y2v1  = 12; int transm1y2v2  = 10; int transm1y2v3  = 33; int embraguev1 = 39; int embraguev2 = 21; int embraguev3 = 23; int transmision1 = 22 ; int transmision2 = 15 ; int transmision3 = 28 ; int lubricacion1 = 28; int lubricacion2 = 11; int lubricacion3 = 21;
      //autobuses frenos 
      String  frenosauv1 = "volvo"; String modeloaut = ""; String modautV1 = "9700"; int balataautv1 = 7 ; String modautv2 = "7300"; String modautv3 = "7550";
      String frenosauv2 = "mercedes"; String modeloautM1 = "Torino"; String modeloautM2 =  "0371"; String modeloautM3 = " MultegoOC-500"; String frenosauv3 = "International"; String modeloautIn1 = "Dacza4700"; String modeloautIn2 = "dt466"; String modeloautIn3 = "4700FE";
      //Base de datos Inventario
      int balatasvolvo = 13 ; int nusuario1 = 0; int bodegab = 0; int opcExit = 0 ; int balatasvolvo2 = 19 ; int balatasvolvo3 = 24 ; int balatasmb2 = 23; int balatasmb3 = 12; int bomb1 = 12; int bomb2 = 22; int bomb3 = 14; int kitcorr1= 11; int kitcorr2= 19; int kitcorr3= 44;  int sensefast1 = 11; int sensefast2 = 10; int sensefast3 = 10;
      int balatasmb = 15; int balatasint = 18 ; int balatasint2 = 8; int balatasint3 = 9 ;int balatasautv2 = 18 ; int balatasautv3 = 5 ;  int balatasautMBv1 = 9; int balatasautMBv2 = 11 ; int balatasautInt1 = 12 ; int balatasautInt2 = 5;  int balatasautInt3 = 12 ;
     // DATOS Base usuarios
     String us1 = "jazz12"; String nombre = " ";   
     int contra1 =  1412;  String apellido = ""; 
     String us2 = "gabriel12"; String estado = "";
     int contra2= 121812;
     String us3 = "rlofrjol58";
     int contra3 = 5855;
     String us4 = "maciasconcejal10";
     int contra4 = 1010;
     
     //precios 
     int frenosp = 270; int piezamotor = 140; int piezatram = 233 ;  
      int tot = 0 ;
        System.out.println("Ingresa tu usiario");
        usuario = entrada.next();
        System.out.println("Ingresa tu contrseña");
        con = entrada.nextInt();
        
        while(opc != 4){ //Jazz
        if(usuario.equals(us1) && con == contra1  ){
            
            System.out.println("BIENVENIDA JAZMIN :D ");
          
           
            System.out.println("Ingresa la opcion que deseas realizar");
            System.out.println("1- Comprar refaciones");
            System.out.println("2- Ingresar al inventario ");
            System.out.println("3- Envios a los clientes ");
            System.out.println("4- Salir");
            opc = entrada.nextInt();
            
            
            switch (opc){
                
                case 1 :
                    //opcR=0;
                    
                    
                    System.out.println("Que tipo de refaciones te gustaria comprar");
                    System.out.println("1- Camiones ");
                    System.out.println("2- Tractores ");
                    System.out.println("3- Autobuses");
                    System.out.println("4- Salir");
                    opcR=entrada.nextInt();
                    
                    
                    switch(opcR){
                        case 1:
                            System.out.println("Que piezas necesitas?");
                            System.out.println("1.Frenos");
                            System.out.println("2.Piezas de motor");
                            System.out.println("3.Piezas de transmision");
                            System.out.println("4.Salir");
                            opcCAM=entrada.nextInt();
                                switch (opcCAM){
                                    
                                    case 1 : 
                                        System.out.println("Frenos");
                                        System.out.println("Que marca busca de camion");
                                        frenosU = entrada.next();
                                        if(frenosU.equals(frenosv)){
                                            System.out.println("MARCA VOLVO ENCONTRADA FAVOR DE DIGITAR EL AÑO MODELO DEL CAMION");
                                            System.out.println("año");    
                                            año = entrada.nextInt();
                                            System.out.println("Modelo");
                                            modelo = entrada.next();
                                            if(modeloV.equals(modelo)&& año >=2014 && año <= 2016){
                                                System.out.println("Modelo encontrado VOLVO VNL630 2014 a 2016 tenemos disponibles  :  " +balatasvolvo + " piezas");
                                                System.out.println("Cuantas necesita ");
                                                nusuario1 = entrada.nextInt();
                                                balatasvolvo = balatasvolvo - nusuario1 ;
                                                carr1 = nusuario1 ;
                                                
                                                System.out.println("");
                                                System.out.println("1.- Agregar al carrito ");
                                                System.out.println("2.- Regresar y comprar mas ");
                                                agcarr = entrada.nextInt();
                                           
                                                switch(agcarr){
                                                    case 1 : 
                                                        System.out.println("Agregar al carrito ");
                                                       
                                                        
                                                }
                                            }else  if (modeloV2.equals(modelo) && año >= 2012 && año <= 2014){
                                                System.out.println("Modelo encontrado Volvo  Vnl64t-630 2012 a 2014 tenemos disponibles " + balatasvolvo2 + " piezas ");
                                                System.out.println("Cuantas necesita");
                                                nusuario1 = entrada.nextInt();
                                                balatasvolvo2 = balatasvolvo2 - nusuario1 ;
                                                carr2 = nusuario1 ;
                                                System.out.println("");
                                                System.out.println("1.- Agregar al carrito ");
                                                System.out.println("2.- Regresar y comprar mas ");
                                                System.out.println("");
                                                switch(agcarr){
                                                    case 1 : 
                                                        System.out.println("Agregar al carrito ");
                                               } 
                                            }else if (modeloV3.equals(modelo)&& año>= 2021 && año <= 2023 ){
                                                System.out.println("Modelo Encontrado Volvo FH-540  año 2021  a 2023 "+ balatasvolvo3+" piezas " );
                                                System.out.println("Cuantas piezas necesitas ");
                                                nusuario1 = entrada.nextInt();
                                                balatasvolvo3 = balatasvolvo3 - nusuario1;
                                                carr3 = nusuario1 ;
                                                System.out.println("");
                                            }else {
                                                System.out.println("Modelo no encontrado ");
                                                
                                            }
                                            
                                        }else if (frenosU.equals(frenosMr)){
                                                System.out.println("Modelo encontrado Mercedes benz");
                                                System.out.println("Ingrese el modelo de su camion");
                                                modelo = entrada.next();
                                                System.out.println("Ingrese el año de su camion");
                                                año = entrada.nextInt();
                                                if (modeloMr.equalsIgnoreCase(modelo) && año >= 2016 && año <= 2019){
                                                    System.out.println("Modelo encontrado Mercedes-Benz freightliner 2016 a 2019 tenemos "+ balatasmb+ " Piezas");
                                                    System.out.println("Cuantas piezas necesita ?");
                                                    nusuario1 = entrada.nextInt();
                                                    balatasmb = balatasmb - nusuario1;
                                                    carr4 = nusuario1 ;
                                                    System.out.println("");
                                                }else if (modelomb2.equals(modelo)&& año == 2009){
                                                    System.out.println("Modelo encontrado Mercedes-Benz L 1624 2009 tenemos "+ balatasmb2+ "piezas");
                                                    System.out.println("Cuantas piezas necesitas");
                                                    nusuario1 = entrada.nextInt();
                                                    balatasmb2 = balatasmb2 - nusuario1;
                                                    carr5 = nusuario1 ;
                                                    System.out.println("");
                                                }else if (modelomb3.equals(modelo)&&año >= 2009 && año <= 2014){
                                                    System.out.println("Modelo encontrado Camion Mercedes-Benz Atego 2425 tenemos "+ balatasmb3+ " piezas ");
                                                    System.out.println("Cuantas piezas necesitas ");
                                                    nusuario1 = entrada.nextInt();
                                                    balatasmb3 = balatasmb3 - nusuario1 ;
                                                    carr6 = nusuario1 ;
                                                    System.out.println("");
                                                    
                                                }else{
                                                    System.out.println("Modelo no encontrado");
                                                }
                                                
                                        }else if (frenosU.equals(frenosin)) {
                                            System.out.println("Modelo encontrado  International ");
                                            System.out.println("Ingrese el modelo de su camion ");
                                            modelo = entrada.next();
                                            System.out.println("Ingrese el año de su camion ");
                                            año = entrada.nextInt();
                                            if(modelo.equalsIgnoreCase(modeloint)&& año >= 2018 && año <= 2022  ){
                                                System.out.println("Modelo encontrado International 4700 SCD DT466 de 2018 a 2022 "+ balatasint);
                                                System.out.println("Cuantas piezas necesitas ");
                                                nusuario1 = entrada.nextInt();
                                                balatasint = balatasint - nusuario1 ;
                                                carr7 = nusuario1 ;
                                                
                                            }else if (modeloint2.equals(modelo)&& año >= 2013 && año <= 2017 ) {
                                                System.out.println("Modelo encontrado International 4400 TORTON 2013 a 2017 "+ balatasint2 + " piezas ");
                                                System.out.println("Cuantas piezas necesitas ");
                                                nusuario1 = entrada.nextInt();
                                                balatasint2 = balatasint2 - nusuario1 ; 
                                                carr8 = nusuario1 ; 
                                                System.out.println("");
                                            }else if (modeloint3.equals(modelo )&& año == 2012){
                                                System.out.println("Modelo encontrado INTERNATIONAL PROSTAR+ 2013 "+ balatasint3 + " Piezas ");
                                                System.out.println("Cuantas piezas necesitas ");
                                                nusuario1 = entrada.nextInt();
                                                balatasint3 = balatasint3 - nusuario1 ;
                                                carr9 = nusuario1 ;
                                                System.out.println("");        
                                                
                                            }
                                        }else{
                                             System.out.println("Por el momento ese modelo no lo manejamos ");   
                                            }
                                            
                                        break;
                                    case 2 :
                                        System.out.println("Piezas de motor");
                                        System.out.println("Que marca de camion es ");
                                        System.out.println("1 volvo ");
                                        System.out.println("2. Mercedes-Benz");
                                        System.out.println("3. International ");
                                        System.out.println("4 Salir");
                                         opcPM = entrada.nextInt();
                                        switch (opcPM){
                                            case 1 :
                                                System.out.println("VOLVO");
                                                System.out.println("1- Bomba refrigerante ");
                                                System.out.println("2- Interruptor de ventilador termico ");
                                                System.out.println("3.- Bomba de combustible");
                                                System.out.println("4- Salir ");
                                                opcPM1 = entrada.nextInt();
                                                switch (opcPM1){
                                                    case 1:
                                                        System.out.println("Bomba refrigerante");
                                                        System.out.println("Cuantas necesitas ");
                                                        nusuario1 = entrada.nextInt();
                                                        bomba1= bomba1 - nusuario1 ;
                                                        carr10 = nusuario1 ;
                                                      break;  
                                                    case 2 : 
                                                        System.out.println("Interruptoe de ventilador termico");
                                                        System.out.println("Cuantos necesita ");
                                                        nusuario1 = entrada.nextInt();
                                                        interr = interr - nusuario1;
                                                        carr11 = nusuario1 ;
                                                        break;
                                                    case 3: 
                                                        System.out.println("Bomba de combustible ");
                                                        System.out.println("Cuanttas necesitas ");
                                                        nusuario1 = entrada.nextInt();
                                                        bombacom = bombacom - nusuario1 ;
                                                        carr12 = nusuario1 ;
                                                        break ;
                                                }
                                                break;
                                                case 2 : 
                                                System.out.println("Mercedes-Benz");                                                                                          
                                                System.out.println("1- Bomba refrigerante ");
                                                System.out.println("2- Interruptor de ventilador termico ");
                                                System.out.println("3.- Bomba de combustible");
                                                System.out.println("4- Salir ");
                                                 opcPM1 = entrada.nextInt();
                                                switch (opcPM1){
                                                    case 1 : 
                                                         System.out.println("Bomba refrigerante");
                                                         System.out.println("Cuantas necesitas ");
                                                         nusuario1 = entrada.nextInt();
                                                         bombacomb = bombacomb -nusuario1 ;
                                                         carr13 = nusuario1 ;
                                                         break;
                                                    case 2 : 
                                                        System.out.println("Interruptoe de ventilador termico");
                                                        System.out.println("Cuantos necesita ");
                                                        nusuario1 = entrada.nextInt();
                                                        interr2 = interr2 - nusuario1 ;
                                                        carr14 = nusuario1 ;
                                                        break ;
                                                    case 3 : 
                                                        System.out.println("Bomba de combustible ");
                                                        System.out.println("Cuanttas necesitas ");
                                                        nusuario1 = entrada.nextInt();
                                                        bombacom2 = bombacom2 - nusuario1 ;
                                                        carr15 = nusuario1 ;
                                                        break ;
                                                } 
                                                     
                                                 case 3 : 
                                                System.out.println("International");
                                                System.out.println("1- Bomba refrigerante ");
                                                System.out.println("2- Interruptor de ventilador termico ");
                                                System.out.println("3- Bomba de combustible");
                                                System.out.println("4- Salir");
                                                opcPM1 = entrada.nextInt();
                                                switch (opcPM1){
                                                    case 1 : 
                                                         System.out.println("Bomba refrigerante");
                                                         System.out.println("Cuantas necesitas ");
                                                         nusuario1 = entrada.nextInt();
                                                         bombaint = bombaint - nusuario1 ;
                                                         break ;
                                                    case 2 : 
                                                         System.out.println("Interruptoe de ventilador termico");
                                                         System.out.println("Cuantos necesita ");
                                                         nusuario1 = entrada.nextInt();
                                                         interr3 = interr3 - nusuario1 ;
                                                         carr16 = nusuario1 ;
                                                         break ; 
                                                    case 3 : 
                                                         System.out.println("Bomba de combustible ");
                                                         System.out.println("Cuanttas necesitas ");
                                                         nusuario1 = entrada.nextInt(); 
                                                         bombacom3 = bombacom3 - nusuario1;
                                                         carr17 = nusuario1 ;
                                                         break;
                                                }
                                            
                                        }
                                          break;
                                    case 3 :
                                        System.out.println("Piezas de transmision para camiones ");
                                        System.out.println("Selecione la marca ");
                                        System.out.println("1.- Volvo");
                                        System.out.println("2.- Mercedes-Benz");
                                        System.out.println("3.- Internatinal ");
                                        System.out.println("4.- Salir");
                                        opcusuario= entrada.nextInt ();
                                        switch (opcusuario){
                                            case 1 : 
                                                System.out.println("Volvo ");
                                                System.out.println("Selecione la refaccione");
                                                System.out.println("1.- Bomba de transmision ");
                                                System.out.println("2.- Sensores de velocidades");
                                                System.out.println("3.- cuerpo de valvulas");
                                                System.out.println("4.- Salir ");
                                                opcusuario = entrada.nextInt();
                                                switch (opcusuario){
                                                    case 1 : 
                                                        System.out.println("Cuantas Bombas necesita");
                                                        nusuario1 = entrada.nextInt();
                                                        bombas1 = bombas1 - nusuario1 ;
                                                        carr18 = nusuario1 ;
                                                        break;
                                                    case 2 :
                                                        System.out.println("Cauntos sensores de velocidad necesita ?");
                                                        nusuario1 = entrada.nextInt();
                                                        sensores1 = sensores1 - nusuario1;
                                                        carr19 = nusuario1 ;
                                                        break;
                                                    case 3 : 
                                                        System.out.println("Cuatas piezs necesita de valvulas ");
                                                        nusuario1= entrada.nextInt();
                                                        cuerpvalv = cuerpvalv - nusuario1;
                                                        carr20 = nusuario1 ;
                                                        break;
                                                }
                                            case 2 : 
                                                System.out.println("Mercedes-Benz");
                                                System.out.println("Selecione la refaccione");
                                                System.out.println("1.- Bomba de transmision ");
                                                System.out.println("2.- Sensores de velocidades");
                                                System.out.println("3.- cuerpo de valvulas");
                                                System.out.println("4.- Salir ");
                                                opcusuario = entrada.nextInt();
                                                switch (opcusuario){
                                                    case 1 :
                                                      System.out.println("Cuantas Bombas necesita");
                                                      nusuario1 = entrada.nextInt();  
                                                      bombas2 = bombas2 - nusuario1 ;
                                                      carr21 = nusuario1 ;
                                                      break;
                                                    case 2 : 
                                                      System.out.println("Cauntos sensores de velocidad necesita ?");
                                                      nusuario1 = entrada.nextInt();
                                                      sensores2 = sensores2 - nusuario1; 
                                                      carr22 = nusuario1 ;
                                                      break;
                                                    case 3 : 
                                                     System.out.println("Cuatas piezs necesita de valvulas ");
                                                        nusuario1= entrada.nextInt();
                                                        cuerpvalv2 = cuerpvalv2 - nusuario1;
                                                        carr23 = nusuario1 ;
                                                        break;   
                                                }
                                            case 3 : 
                                                System.out.println("International");
                                                System.out.println("Selecione la refaccione");
                                                System.out.println("1.- Bomba de transmision ");
                                                System.out.println("2.- Sensores de velocidades");
                                                System.out.println("3.- cuerpo de valvulas");
                                                System.out.println("4.- Salir ");   
                                                opcusuario = entrada.nextInt();
                                                switch (opcusuario){
                                                    case 1 : 
                                                      System.out.println("Cuantas Bombas necesita");
                                                      nusuario1 = entrada.nextInt();  
                                                      bombas3 = bombas3 - nusuario1 ;
                                                      carr24 = nusuario1 ;
                                                      break;
                                                    case 2 :  
                                                      System.out.println("Cauntos sensores de velocidad necesita ?");
                                                      nusuario1 = entrada.nextInt();
                                                      sensores3 = sensores3 - nusuario1; 
                                                      carr25 = nusuario1 ;
                                                      break;
                                                    case 3 : 
                                                        System.out.println("Cuatas piezs necesita de valvulas ");
                                                        nusuario1= entrada.nextInt();
                                                        cuerpvalv3 = cuerpvalv3 - nusuario1;
                                                        carr26 = nusuario1 ;
                                                        break;
                                                }
                                        }
                                        break;
     

                                }
                            break;
                    
                        case 2:
                            System.out.println("Tractores ");
                            System.out.println("1- Frenos");
                            System.out.println("2- Piezas de motor");
                            System.out.println("3- Piezas de transmision");
                            System.out.println("4- Salir");
                            tractop = entrada.nextInt();
                            switch (tractop){
                                case 1 : 
                                     System.out.println("Frenos ");
                                     System.out.println("Seleccione la marca");
                                     System.out.println("1- John Deere.");
                                     System.out.println("2- New Holland");
                                     System.out.println("3- Kubota. ");
                                     opcusuario = entrada.nextInt();
                                        switch (opcusuario){
                                            case 1 : 
                                                System.out.println("Jhon Deere frenos que tipo de frenos necesita ");
                                                System.out.println("1.- Juego de bandas de frenos ");
                                                System.out.println("2.- Freno de hoja");
                                                System.out.println("3.- Ajuste de freno ");
                                                opcusuario = entrada.nextInt();
                                                    switch (opcusuario ){
                                                        case 1 : 
                                                            System.out.println("1.- Juego de bandas de frenos");    
                                                            System.out.println("Digite cuantos desea comprar ");
                                                            nusuario1= entrada.nextInt();
                                                            bandafren = bandafren - nusuario1; 
                                                            carr27 = nusuario1 ;
                                                            break; 
                                                        case 2 : 
                                                            System.out.println("Freno de hoja ");
                                                            System.out.println("Digite cuantos desea comprar ");
                                                            nusuario1= entrada.nextInt();
                                                            frenhoja1 = frenhoja1 - nusuario1 ;
                                                            carr28 = nusuario1 ;
                                                            break; 
                                                        case 3 : 
                                                            System.out.println("Ajuste de frenos");
                                                            System.out.println("Digite cuantos desea comprar ");
                                                            nusuario1= entrada.nextInt();
                                                            ajustefren1 = ajustefren1 -  nusuario1 ; 
                                                            carr29 = nusuario1 ;
                                                            break;                                           
                                                    }
                                            case 2 : 
                                                System.out.println(" New Holland frenos que tipo de frenos necesita ");
                                                System.out.println("1.- Juego de bandas de frenos ");
                                                System.out.println("2.- Freno de hoja");
                                                System.out.println("3.- Ajuste de freno ");
                                                opcusuario = entrada.nextInt();
                                                switch (opcusuario ){
                                                    case 1 : 
                                                      System.out.println("1.- Juego de bandas de frenos");    
                                                      System.out.println("Digite cuantos desea comprar ");
                                                      nusuario1= entrada.nextInt();
                                                      bandafren2 = bandafren2 - nusuario1; 
                                                      carr30 = nusuario1 ;
                                                      break; 
                                                    case 2 : 
                                                       System.out.println("Freno de hoja ");
                                                       System.out.println("Digite cuantos desea comprar ");
                                                       nusuario1= entrada.nextInt();
                                                       frenhoja2 = frenhoja2 - nusuario1 ;
                                                       carr31 = nusuario1 ;
                                                       break; 
                                                    case 3 : 
                                                       System.out.println("Ajuste de frenos");
                                                       System.out.println("Digite cuantos desea comprar ");
                                                       nusuario1= entrada.nextInt();
                                                       ajustefren2 = ajustefren2 -  nusuario1 ; 
                                                       carr32 = nusuario1 ;
                                                       break; 
                                                    
                                                }
                                            case 3 : 
                                                System.out.println(" Kubota frenos que tipo de frenos necesita ");
                                                System.out.println("1.- Juego de bandas de frenos ");
                                                System.out.println("2.- Freno de hoja");
                                                System.out.println("3.- Ajuste de freno ");
                                                opcusuario = entrada.nextInt();
                                                 switch (opcusuario ){
                                                     case 1 : 
                                                      System.out.println("1.- Juego de bandas de frenos");    
                                                      System.out.println("Digite cuantos desea comprar ");
                                                      nusuario1= entrada.nextInt();
                                                      bandafren3 = bandafren3 - nusuario1; 
                                                      carr33 = nusuario1 ;
                                                      break;
                                                     case 2 : 
                                                       System.out.println("Freno de hoja ");
                                                       System.out.println("Digite cuantos desea comprar ");
                                                       nusuario1= entrada.nextInt();
                                                       frenhoja3 = frenhoja3 - nusuario1 ;
                                                       carr34 = nusuario1 ;
                                                       break;
                                                     case 3 : 
                                                       System.out.println("Ajuste de frenos");
                                                       System.out.println("Digite cuantos desea comprar ");
                                                       nusuario1= entrada.nextInt();
                                                       ajustefren3 = ajustefren3 -  nusuario1 ;
                                                       carr35 = nusuario1 ;
                                                       break;                                                                
                                                 }

                                        }
                                    break;
                                case 2 : 
                                     System.out.println("Piezas de motor");
                                     System.out.println("Seleccione la marca");
                                     System.out.println("1- John Deere.");
                                     System.out.println("2- New Holland");
                                     System.out.println("3- Kubota. ");
                                     opcusuario = entrada.nextInt();
                                     switch (opcusuario){
                                         case 1 : 
                                             System.out.println("John Deere");
                                             System.out.println("1.- Cigueñal ");
                                             System.out.println("2.- Arbol de levas ");
                                             System.out.println("3.- Tren de engranes frontal ");
                                             opcusuario = entrada.nextInt();
                                             switch (opcusuario){
                                                 case 1 : 
                                                     System.out.println("Cigueñal cuantas piezas desea comprar ");
                                                     nusuario1 = entrada.nextInt();
                                                     cigueñaltrack1 = cigueñaltrack1- nusuario1;
                                                     carr36 = nusuario1 ;
                                                     break; 
                                                 case 2 : 
                                                     System.out.println("Arbol de levas cuadas piezas desea comprar");
                                                     nusuario1 = entrada.nextInt();
                                                     arbollevtrac1 = arbollevtrac1 - nusuario1 ; 
                                                     carr37 = nusuario1 ;
                                                     break; 
                                                 case 3 : 
                                                     System.out.println("Tren de engranes frontal ");
                                                     nusuario1 = entrada.nextInt(); 
                                                     engranestrack1 = engranestrack1 - nusuario1 ;
                                                     carr38 = nusuario1 ;
                                                     
                                                     break; 
                                             }
                                         case 2 : 
                                             System.out.println("New Holland");
                                             System.out.println("1.- Cigueñal ");
                                             System.out.println("2.- Arbol de levas ");
                                             System.out.println("3.- Tren de engranes frontal ");
                                             opcusuario = entrada.nextInt();
                                             switch (opcusuario){
                                                 
                                                 case 1 : 
                                                     System.out.println("Cigueñal cuantas piezas desea comprar ");
                                                     nusuario1 = entrada.nextInt();
                                                     cigueñaltrack2 = cigueñaltrack2- nusuario1;
                                                     carr39 = nusuario1 ;
                                                     break; 
                                                 case 2 : 
                                                     System.out.println("Arbol de levas cuadas piezas desea comprar");
                                                     nusuario1 = entrada.nextInt(); 
                                                     arbollevtrac2 = arbollevtrac2 - nusuario1 ; 
                                                     carr40 = nusuario1 ;
                                                     break; 
                                                 case 3 : 
                                                     System.out.println("Tren de engranes frontal ");
                                                     nusuario1 = entrada.nextInt(); 
                                                     engranestrack2 = engranestrack2 - nusuario1 ; 
                                                     carr41 = nusuario1 ;
                                                     break;  
                                             }
                                         case 3 : 
                                             System.out.println("Kubota");
                                             System.out.println("1.- Cigueñal ");
                                             System.out.println("2.- Arbol de levas ");
                                             System.out.println("3.- Tren de engranes frontal ");
                                             opcusuario = entrada.nextInt();
                                             switch (opcusuario){
                                                 
                                                 case 1 : 
                                                     System.out.println("Cigueñal cuantas piezas desea comprar ");
                                                     nusuario1 = entrada.nextInt();
                                                     cigueñaltrack3 = cigueñaltrack3- nusuario1;
                                                     carr42 = nusuario1 ;
                                                     break; 
                                                 case 2 : 
                                                     System.out.println("Arbol de levas cuantas piezas desea comprar");
                                                     nusuario1 = entrada.nextInt(); 
                                                     arbollevtrac3 = arbollevtrac3 - nusuario1 ; 
                                                     carr43 = nusuario1 ;
                                                     break; 
                                                 case 3 : 
                                                     System.out.println("Tren de engranes frontal cuantas piezas desea comprar ");
                                                     nusuario1 = entrada.nextInt(); 
                                                     engranestrack3 = engranestrack3 - nusuario1 ; 
                                                     carr44 = nusuario1 ;
                                                     break;   
                                         }   
                                             break;
                                     }
                                     
                                    break;
                                case 3 :     
                                    System.out.println("Piezas de transmision ");
                                     System.out.println("Seleccione la marca");
                                     System.out.println("1- John Deere.");
                                     System.out.println(" 2- New Holland");
                                     System.out.println("3- Kubota. ");
                                     opcusuario = entrada.nextInt();
                                     switch (opcusuario){
                                         
                                         case 1 : 
                                             System.out.println("John Deere.");
                                             System.out.println("1- Placas de transmisión genuinas John Deere");
                                             System.out.println("2- John Deere Luc embrague");
                                             System.out.println("3- TRACTOR JOHN DEERE F217 TRANSMISIÓN 1a y 2da VELOCIDAD PIÑÓN DESLIZANTE PIÑÓN G");
                                             opcusuario = entrada.nextInt();
                                             switch (opcusuario){
                                                 case 1 : 
                                                  System.out.println("Placas de transmisión genuinas John Deere");
                                                     System.out.println("Cuantas desea comprar"); 
                                                     nusuario1 = entrada.nextInt();
                                                     placas1 = placas1 - nusuario1;
                                                     carr45 = nusuario1;
                                                     break; 
                                                 case 2 : 
                                                     System.out.println("Luc embrague");
                                                     System.out.println("Cuantas desea comprar");
                                                     nusuario1 = entrada.nextInt();
                                                     embrague1 = embrague1 - nusuario1 ;
                                                     carr46 = nusuario1;
                                                     break; 
                                                 case 3 : 
                                                     System.out.println("TRANSMISIÓN 1a y 2da VELOCIDAD PIÑÓN DESLIZANTE PIÑÓN G");
                                                     System.out.println(" Cuantas desea comprar ");
                                                     nusuario1 = entrada.nextInt(); 
                                                     transm1y2v1 = transm1y2v1 - nusuario1 ;
                                                     carr46 = nusuario1;
                                                     break; 
                                             }
                                             break; 
                                         case 2 : 
                                             System.out.println("New Holland");;
                                             System.out.println("1- Placas de transmisión genuinas New Holland");
                                             System.out.println("2- New Holland Luc embrague");
                                             System.out.println("3- TRACTOR New Holland F217 TRANSMISIÓN 1a y 2da VELOCIDAD PIÑÓN DESLIZANTE PIÑÓN G");
                                             opcusuario = entrada.nextInt();
                                             switch (opcusuario){
                                                 
                                                 case 1 :
                                                     System.out.println("Placas de transmisión genuinas New Holland");
                                                     System.out.println(" Cuantas desea comprar ");
                                                     nusuario1 = entrada.nextInt();
                                                     placas2 = placas2 - nusuario1;
                                                     carr47 = nusuario1;
                                                     break; 
                                                 case 2 : 
                                                     System.out.println("New Holland Luc embrague");
                                                     System.out.println(" Cuantas desea comprar ");
                                                     nusuario1 = entrada.nextInt();
                                                     embrague2 = embrague2 - nusuario1 ;
                                                     carr48 = nusuario1;
                                                     break; 
                                                 case 3 : 
                                                     System.out.println("TRACTOR New Holland F217 TRANSMISIÓN 1a y 2da VELOCIDAD PIÑÓN DESLIZANTE PIÑÓN G");
                                                     System.out.println(" Cuantas desea comprar ");
                                                     nusuario1 = entrada.nextInt();
                                                     transm1y2v2 = transm1y2v2 - nusuario1 ;
                                                     carr49 = nusuario1;
                                                     break; 
                                             }
                                                break; 
                                            
                                         case 3 : 
                                             System.out.println("Kubota");
                                             System.out.println("1- Placas de transmisión genuinas Kubota");
                                             System.out.println("2- Kubota Luc embrague");
                                             System.out.println("3- TRACTOR Kubotad F217 TRANSMISIÓN 1a y 2da VELOCIDAD PIÑÓN DESLIZANTE PIÑÓN G");
                                             opcusuario = entrada.nextInt();
                                             switch (opcusuario){
                                                 case 1 : 
                                                  System.out.println("Placas de transmisión genuinas Kubota");
                                                  System.out.println(" Cuantas desea comprar ");
                                                  nusuario1 = entrada.nextInt();   
                                                  placas3 = placas3 - nusuario1;
                                                  carr50 = nusuario1;
                                                  break; 
                                                 case 2 : 
                                                   System.out.println("KubotaLuc embrague");
                                                   System.out.println(" Cuantas desea comprar ");
                                                   nusuario1 = entrada.nextInt();
                                                   embrague3 = embrague3 - nusuario1 ;
                                                   carr51 = nusuario1;
                                                   break;   
                                                 case 3 : 
                                                    System.out.println("TRACTOR Kubota F217 TRANSMISIÓN 1a y 2da VELOCIDAD PIÑÓN DESLIZANTE PIÑÓN G");
                                                    System.out.println(" Cuantas desea comprar ");
                                                    nusuario1 = entrada.nextInt(); 
                                                    transm1y2v3 = transm1y2v3 - nusuario1 ;
                                                    carr52 = nusuario1;
                                                    break ; 
                                             }
                                     }
                                     break; }
                            break;
                        case 3 :
                            System.out.println("AUTOBUSES "); // aqui me quede 
                            System.out.println("1.Frenos");
                            System.out.println("2.Piezas de motor");
                            System.out.println("3.Piezas de transmision");
                            System.out.println("4.Salir");
                            opcAUT = entrada.nextInt();
                            
                            switch(opcAUT){
                                case 1 :
                                    System.out.println("Bienvenido a frenos !");
                                    System.out.println("Que marca busca de Autobus");
                                    frenosu3 = entrada.next();
                                    
                                    if(frenosu3.equals(frenosauv1)){
                                        System.out.println("Marca encontrada Volvo");
                                        System.out.println("Digite su modelo");
                                        modeloaut = entrada.next();
                                        System.out.println("Digite el año ");
                                        año = entrada.nextInt();
                                        if (modeloaut.equals(modautV1)&& año >= 2017 && año <= 2022  ) {
                                            System.out.println("Modelo encontrado volvo 9700 select año 2017 a 2018 "+ balataautv1 + "Piezas ");
                                            System.out.println("Cuantas piezas necesitas ");
                                            nusuario1 = entrada.nextInt();
                                            balataautv1 =  balataautv1 - nusuario1 ;
                                            carr53 = nusuario1;
                                            System.out.println("");
                                        }else if (modeloaut.equals(modautv2)&& año >= 2014 && año <= 2016 ){
                                            System.out.println("Modelo encontrado Volvo 7300 año 2014 a 2016 tenemos " + balatasautv2 + " Piezas ");
                                            System.out.println("Cuantas piezas necesitas ");
                                            nusuario1 = entrada.nextInt();
                                            balatasautv2 = balatasautv2 - nusuario1 ;
                                            carr54 = nusuario1;
                                            System.out.println("");    
                                        }else if (modeloaut.equals(modautv3)&& año >=  2006 && año <= 2010){
                                            System.out.println("Modelo encontrado volvo 7550 año 2006 a 2010  tenemos "+ balatasautv3 + " Piezas ");      
                                            System.out.println("Cuantas piezas necesita ");
                                            nusuario1 = entrada.nextInt();
                                            balatasautv3 = balatasautv3 - nusuario1 ;
                                            carr55 = nusuario1;
                                            System.out.println("");
                                            
                                        }else {
                                            System.out.println("Modelo no disponible ");
                                        }
                                        
                                    }else if (frenosu3.equals(frenosauv2)) {
                                        System.out.println("Modelo encontrado mercedes-Benz");
                                        System.out.println("Digite su modelo ");
                                        modeloaut = entrada.next();
                                        System.out.println("Digite su año ");
                                        año = entrada.nextInt();
                                        if (modeloaut.equals(modeloautM1)&& año >= 2009 && año  <= 2013 ){
                                            System.out.println("Modelo encontrado  de mercedes-Benz Torino año 2009 a 2013 tenmos disponibles  "+ balatasautMBv1 + " Piezas ");
                                            System.out.println("Cuantas piezas desea comprar ");
                                            nusuario1 = entrada.nextInt ();
                                            balatasautMBv1 = balatasautMBv1 - nusuario1 ; 
                                            carr56 = nusuario1;
                                            System.out.println("");
                                        }else if (modeloaut.equals(modeloautM2)&& año>= 2007 && año <= 2009) {
                                            System.out.println("Modelo encontrado de merecedes-Benz  0371 año 2007 a 2009 "+ balatasautMBv2+ " piezas ");
                                            System.out.println("Cuantas piezas desea comprar ");
                                            nusuario1 = entrada.nextInt();
                                            balatasautMBv2 = balatasautMBv2 - nusuario1 ;
                                            carr57 = nusuario1;
                                            System.out.println("");     
                                        }else if (modeloaut.equals(modeloautM3)&& año >= 2008 && año <= 2010 ){ 
                                            System.out.println("Modelo encontrado de mercedes-Benz  Multego OC-500 del año 2008 a 2010 " + balatasautMBv2 + " piezas ");
                                            System.out.println("Cuantas piezas desea comprar ");
                                            nusuario1 = entrada.nextInt();
                                            balatasautMBv2 = balatasautMBv2 - nusuario1 ;   
                                            carr58 = nusuario1;
                                            System.out.println("");
                                            
                                        }else {
                                            System.out.println("Modelo no disponible ");
                                        }
                                    }else if (frenosu3.equals(frenosauv3)) { 
                                        System.out.println("Modelo encontrado International");
                                        System.out.println("Digite su modelo");
                                        modeloaut = entrada.next();
                                        System.out.println("Digite su año ");
                                        año = entrada.nextInt();
                                        if (modeloaut.equals(modeloautIn1) && año >= 2012 && año <= 2015 ){
                                            System.out.println("Modelo encontrado International Dacza 4700 año 2012 a 2015 tenemos " + balatasautInt1 + " piezas ");
                                            System.out.println("Cuantas desea comprar ");
                                            nusuario1 = entrada.nextInt();
                                            balatasautInt1 = balatasautInt1 - nusuario1;
                                            carr59 = nusuario1;
                                            System.out.println("");
                                            
                                        }else if (modeloaut.equals(modeloautIn2) && año >= 2004 && año <= 2007 ){
                                            System.out.println("Modelo encontrado International DT466 Bus americano año 2004 a 2007 tenemos "+balatasautInt2+ " piezas " );
                                            System.out.println("Cuantas desea comprar ");
                                            nusuario1 = entrada.nextInt();
                                            balatasautInt2 = balatasautInt2 - nusuario1;
                                              carr60 = nusuario1;                                          
                                            System.out.println("");
                                        }else if (modeloaut.equals(modeloautIn3) && año >= 2020 && año <= 2022 ){
                                            System.out.println("Modelo encontrado International 4700FE año 2020 a 2022 tenemos "+balatasautInt3 + " Piezas");
                                            System.out.println("Cuantas desea comprar ");
                                            nusuario1 = entrada.nextInt();
                                            balatasautInt3 = balatasautInt3 - nusuario1;
                                            carr61 = nusuario1;
                                            System.out.println("");
                                        }else{
                                            System.out.println("No disponible");
                                        }
                                    }
                                case 2 : 
                                    System.out.println("Piezas de motor de autobus  Selecione su modelo "); 
                                    System.out.println("1.- Volvo ");
                                    System.out.println("2.- Mercedes-Benz");
                                    System.out.println("3.- International ");
                                    opcAUT = entrada.nextInt();
                                    
                                    switch (opcAUT){
                                        case 1 : 
                                            System.out.println("Volvo");
                                            System.out.println("1.- Bomba de aceite se adapta a: RVI C, K, KERAX, MAGNUM, T; VOLVO 9700, 9900,");
                                            System.out.println("2.- Kit de correa de cámara de sincronización + bomba de agua para Volvo XC60 XC90 V70 XC70 S60 S80 V60");
                                            System.out.println("3.- Sensor de velocidad de posición del cigüeñal del motor Dorman 904-77 OE");
                                            opcusuario = entrada.nextInt();
                                            switch (opcusuario){
                                                case 1 :
                                                    System.out.println("Bomba de aceite");
                                                    System.out.println("Cuantas desea comprar");
                                                    nusuario1 = entrada.nextInt();
                                                    bomb1 = bomb1 - nusuario1;
                                                    carr62 = nusuario1;
                                                    break;
                                                case 2 : 
                                                    System.out.println("Kit de correa ");
                                                    System.out.println("Cuantas desea comprar");
                                                    nusuario1 = entrada.nextInt();
                                                    kitcorr1= kitcorr1 - nusuario1;
                                                    carr63 = nusuario1;
                                                    break;
                                                case 3 :
                                                    System.out.println("Sensor de velocidad de posición del cigüeñal");
                                                    System.out.println("Cuantos desea comprar");
                                                    nusuario1 = entrada.nextInt();
                                                    sensefast1 = sensefast1 - nusuario1; 
                                                    carr64 = nusuario1;
                                                    break; 
                                            }
                                            break; 
                                        case 2 : 
                                            System.out.println("Mercedes-Benz");
                                            System.out.println("1.- Bomba de aceite ");
                                            System.out.println("2.- Kit de correa de cámara de sincronización + bomba de agua ");
                                            System.out.println("3.- Sensor de velocidad de posición del cigüeñal del motor Dorman");
                                            opcusuario = entrada.nextInt();
                                            switch (opcusuario){
                                                case 1 :
                                                    System.out.println("Bomba de aceite");
                                                    System.out.println("Cuantas desea comprar");
                                                    nusuario1 = entrada.nextInt();
                                                    bomb2 = bomb2 - nusuario1;
                                                    carr65 = nusuario1;
                                                    break;
                                                case 2 : 
                                                    System.out.println("Kit de correa ");
                                                    System.out.println("Cuantas desea comprar");
                                                    nusuario1 = entrada.nextInt();
                                                    kitcorr2= kitcorr2 - nusuario1;
                                                    carr66 = nusuario1;
                                                    break;
                                                case 3 :
                                                    System.out.println("Sensor de velocidad de posición del cigüeñal");
                                                    System.out.println("Cuantos desea comprar");
                                                    nusuario1 = entrada.nextInt();
                                                    sensefast2 = sensefast2 - nusuario1;
                                                    carr67 = nusuario1;
                                            break;
                                            }
                                        case 3 : 
                                            System.out.println("International ");                                           
                                            System.out.println("1.- Bomba de aceite ");
                                            System.out.println("2.- Kit de correa de cámara de sincronización + bomba de agua ");
                                            System.out.println("3.- Sensor de velocidad de posición del cigüeñal del motor Dorman");
                                            opcusuario = entrada.nextInt();
                                                    switch (opcusuario){
                                                     case 1 :
                                                         System.out.println("Bomba de aceite");
                                                         System.out.println("Cuantas desea comprar");
                                                         nusuario1 = entrada.nextInt();
                                                         bomb3 = bomb3 - nusuario1;
                                                         carr68 = nusuario1;
                                                    break;
                                                          case 2 : 
                                                          System.out.println("Kit de correa ");
                                                          System.out.println("Cuantas desea comprar");
                                                          nusuario1 = entrada.nextInt();
                                                          kitcorr3= kitcorr3 - nusuario1;
                                                          carr69 = nusuario1;
                                                    break;
                                                           case 3 :
                                                           System.out.println("Sensor de velocidad de posición del cigüeñal");
                                                           System.out.println("Cuantos desea comprar");
                                                           nusuario1 = entrada.nextInt();
                                                           sensefast3 = sensefast3 - nusuario1;
                                                           carr70 = nusuario1;
                                                    break;        
                                            }
                                            break;
                                    }
                                    break;
                                case 3:
                                    System.out.println("Piezas de Transmision Selecione la marca  ");
                                    System.out.println("1.- Volvo");
                                    System.out.println("2.- Mercedes-Benz");
                                    System.out.println("3.- International ");
                                    System.out.println("4.- Salir");
                                    opcusuario = entrada.nextInt();
                                    switch(opcusuario){
                                        
                                        case 1 : 
                                            System.out.println("Volvo Seleccione su pieza ");
                                            System.out.println("1.- Road Choice Clu embrague ");
                                            System.out.println("2.- Llave de transmision ");
                                            System.out.println("3.- Tubo de linea de lubricacion ");
                                            System.out.println("4.- salir  ");
                                            opcusuario = entrada.nextInt();
                                             switch (opcusuario){
                                                 case 1 : 
                                                     System.out.println(" Road Choice Clu embrague de  volvo  Cuantos necesita ");
                                                     nusuario1  = entrada.nextInt();
                                                     embraguev1 = embraguev1 - nusuario1 ; 
                                                     carr71 = nusuario1;
                                                     break ; 
                                                 case 2 : 
                                                     System.out.println("Llave de transmision de volov Cuantos necesitas ");
                                                     nusuario1  = entrada.nextInt();
                                                     transmision1 = transmision1 - nusuario1;
                                                     carr72 = nusuario1;
                                                     break; 
                                                 case 3 : 
                                                     System.out.println("Tubo de linea de lubricacion de volvo cuantos necesitas ");
                                                     nusuario1  = entrada.nextInt();
                                                     lubricacion1 = lubricacion1 - nusuario1; 
                                                     carr73 = nusuario1;
                                                     break;
                                             }
                                            break;
                                        case 2 : 
                                            System.out.println("Mercedes-Benz Selecione su pieza ");
                                            System.out.println("1.- Road Choice Clu embrague ");
                                            System.out.println("2.- Llave de transmision ");
                                            System.out.println("3.- Tubo de linea de lubricacion ");
                                            System.out.println("4.- salir  ");
                                            opcusuario = entrada.nextInt();
                                             switch (opcusuario){
                                                 case 1 : 
                                                     System.out.println(" Road Choice Clu embrague de  Mercedes-Benz  Cuantos necesita ");
                                                     nusuario1  = entrada.nextInt();
                                                     embraguev2 = embraguev2 - nusuario1 ; 
                                                     carr74 = nusuario1;
                                                     break ; 
                                                 case 2 : 
                                                     System.out.println("Llave de transmision de Mercedes-Benz Cuantos necesitas ");
                                                     nusuario1  = entrada.nextInt();
                                                     transmision2 = transmision2 - nusuario1;
                                                     carr75 = nusuario1;
                                                     break; 
                                                 case 3 : 
                                                     System.out.println("Tubo de linea de lubricacion de volvo cuantos necesitas");
                                                     nusuario1  = entrada.nextInt();
                                                     lubricacion2 = lubricacion2 - nusuario1;
                                                     carr75 = nusuario1;
                                                     break;
                                                 
                                             }
                                            
                                            break; 
                                        case 3 : 
                                            System.out.println("International");
                                            System.out.println("1.- Road Choice Clu embrague ");
                                            System.out.println("2.- Llave de transmision ");
                                            System.out.println("3.- Tubo de linea de lubricacion ");
                                            System.out.println("4.- salir  ");
                                            opcusuario = entrada.nextInt();
                                            switch (opcusuario){
                                                 case 1 : 
                                                     System.out.println(" Road Choice Clu embrague de International Cuantos necesita ");
                                                     nusuario1  = entrada.nextInt();
                                                     embraguev3 = embraguev3 - nusuario1 ; 
                                                     carr76 = nusuario1;
                                                     break ; 
                                                 case 2 : 
                                                     System.out.println("Llave de transmision de International Cuantos necesitas ");
                                                     nusuario1  = entrada.nextInt();
                                                     transmision3 = transmision3 - nusuario1;
                                                     carr77 = nusuario1;
                                                     break; 
                                                 case 3 : 
                                                     System.out.println("Tubo de linea de lubricacion de International cuantos necesitas");
                                                     nusuario1  = entrada.nextInt();
                                                     lubricacion3 = lubricacion3 - nusuario1;
                                                     carr78 = nusuario1;
                                                     break;
                                        }
                                    }
                            }
                        default:
                        
                    }
                    
                case 2:
                   System.out.println("INVENTARIO y VENTAS ");
                   System.out.println("1.- Carrito de compras ");
                   System.out.println("2.-  Checar inventario");
                   System.out.println("3.- Salir");
                   opcI=entrada.nextInt();
                   switch (opcI){
                        case 1 : 
                           System.out.println("CARRITO DE COMPRAS");
                            totl = carr1 + carr2+ carr3+ carr4+ carr5+ carr6+ carr7+ carr8+ carr9+ carr10+ carr11+ carr12+ carr13+ carr14+ carr15+ carr16+ carr17 + carr18+ carr19+ carr20+carr21+ carr22+ carr23+ carr24+carr25+carr26+carr27+carr28+carr29+carr30+carr31+carr32+carr33+carr34+carr35+
                            carr36+carr37+carr38+carr39+carr40+carr41+carr42+carr43+carr44+carr45+carr46+carr47+carr48+carr49+carr50+carr51+carr52+carr53+carr54+carr58+carr59+carr60+carr61+ carr62+ carr63+ carr64+carr65+carr66+carr67+carr68+carr69+carr70+carr71+carr72+carr73+carr74+carr75; 
                            System.out.println("Tienes en tu carrito de compras "+(totl- totldelte)+" piezas por pagar");
                            System.out.println("1.- Proceder a facturar y enviar");
                            System.out.println("2.- eliminar compras "); 
                            System.out.println("3.- Salir ");
                            opcusuario = entrada.nextInt();
                            tot = totl * 222;
                            switch (opcusuario){
                                case 1 : 
                                    System.out.println("Facturacion y envio");    
                                    System.out.println("Escribe tu nombre");
                                    nombre= entrada.next();
                                    System.out.println("Escribe tu apellido");
                                    apellido = entrada.next();
                                    System.out.println("Escribe tu Estado ");
                                    estado = entrada.next();
                                    System.out.println("Listo pedido registrado");
                                   
                                   break;
                                case 2 : 
                                    System.out.println("Seguro quiere eliminar");
                                    System.out.println("1. Si");
                                    System.out.println("2. no ");
                                    opcusuario = entrada.nextInt();
                                    switch(opcusuario){
                                        case 1:
                                            System.out.println("Eliminado");
                                            totldelte = totl;
                                    //totl = carr1 - carr2- carr3-carr4- carr5- carr6- carr7-carr8- carr9- carr10- carr11- carr12- carr13- carr14- carr15-carr16- carr17 - carr18- carr19- carr20-carr21- carr22- carr23- carr24-carr25-carr26-carr27-carr28-carr29-carr30-carr31-carr32-carr33-carr34-carr35-
                          //  carr36-carr37-carr38-carr39-carr40-carr41-carr42-carr43-carr44-carr45-carr46-carr47-carr48-carr49-carr50-carr51-carr52-carr53-carr54-carr58-carr59-carr60-carr61- carr62- carr63- carr64-carr65-carr66-carr67-carr68-carr69-carr70-carr71-carr72-carr73-carr74-carr75;
                                    break;
                                    }
                                break;    
                            }
                           break;
                        case 2 :
                            System.out.println("INVENTARIO"); 
                            System.out.println("Selecciona el modelo");
                            System.out.println("1.- volvo");
                            System.out.println("2.- Mercedes-Benz");
                            System.out.println("3.- international");
                            System.out.println("4.- John Deere");
                            System.out.println("5.- New Holland");
                            System.out.println("6.- Kubota");
                            System.out.println("EXIT");
                            opcusuario = entrada.nextInt();
                            switch (opcusuario){
                                case 1:
                                    System.out.println("VOLVO");
                                    System.out.println("tienes "+ balatasvolvo2+" Balatas");
                                    System.out.println("Tienes "+balatasvolvo + " Balatas ");
                                    System.out.println("Tienes "+bomba1+ " Bomba volvo" );
                                    System.out.println("Tienes "+ interr+ " piezas interr");
                                    System.out.println("1.-  Añadir             ");
                                    System.out.println("2-  Salir");
                                    opcusuario = entrada.nextInt();
                                    switch ( opcusuario){
                                        case 1 :
                                            System.out.println("Añadir");
                                            System.out.println("Cuantas piezas desa pedir al provedor");
                                            nusuario1= entrada.nextInt();
                                            break;
                                    }
                                    break;
                                case 2 : 
                                    System.out.println("Mercedes-Benz");
                                    System.out.println("Tienes "+balatasmb + " balatas " );
                                    System.out.println("Tienes "+bombacomb+ "bombas ");
                                    System.out.println("Tienes "+interr2+ " Iterruptores ");
                                    System.out.println("1.- Añadir mas ");
                                    System.out.println("2.- Salir");
                                    opcusuario = entrada.nextInt();
                                    switch ( opcusuario){
                                        case 1 :
                                            System.out.println("Añadir");
                                            System.out.println("Cuantas piezas desa pedir al provedor");
                                            nusuario1= entrada.nextInt();
                                            break;
                                        
                                    }
                                    break;
                                case 3 :
                                    System.out.println("international");
                                    System.out.println("Tines "+ bandafren+ " Bada de frenos");
                                    System.out.println("Tienes "+embraguev3+ "Embragues " );
                                    System.out.println("tienes "+ balatasint3+ " Balaztas");
                                    System.out.println("1.- Añadir mas ");
                                    System.out.println("2.- Salir");
                                    opcusuario = entrada.nextInt();
                                    switch ( opcusuario){
                                        case 1 :
                                            System.out.println("Añadir");
                                            System.out.println("Cuantas piezas desa pedir al provedor");
                                            nusuario1= entrada.nextInt();
                                            break; 
                                        
                                    }
                                    break; 
                                case 4 : 
                                    System.out.println("John Deere");
                                    System.out.println("Tienes "+ placas1+ " Placas  de transmision");
                                    System.out.println("Tienes "+ embrague1+ " Embragues ");
                                    System.out.println("Tienes "+transm1y2v1+ " piezas de trnasmicion " );
                                    System.out.println("1.- Añadir mas ");
                                    System.out.println("2.- Salir");
                                    opcusuario = entrada.nextInt();
                                    switch ( opcusuario){
                                        case 1 :
                                            System.out.println("Añadir");
                                            System.out.println("Cuantas piezas desa pedir al provedor");
                                            nusuario1= entrada.nextInt();
                                            break; 
                                        
                                    }
                                    break; 
                                case 5 : 
                                    System.out.println("New Holland");
                                    System.out.println("Tienes "+placas2+ " Placas de transmision " );
                                    System.out.println("Tienes"+ transm1y2v2+ " Treanmisiones " );
                                    System.out.println("1.- Añadir mas ");
                                    System.out.println("2.- Salir");
                                    opcusuario = entrada.nextInt();
                                    switch ( opcusuario){
                                        case 1 :
                                            System.out.println("Añadir");
                                            System.out.println("Cuantas piezas desa pedir al provedor");
                                            nusuario1= entrada.nextInt();
                                            break;
                                        
                                    }
                                    break ;
                                case 6 :
                                    System.out.println("Kubota");
                                    System.out.println("Tienes "+ placas3+ " Placas de transmision ");
                                    System.out.println("Tienes "+ embrague3+ " Embragues ");
                                    System.out.println("Tienes "+ transm1y2v3+ " Transmisiones ");
                                    System.out.println("");
                                    System.out.println("1.- Añadir mas ");
                                    System.out.println("2.- Salir");
                                    opcusuario = entrada.nextInt();
                                    switch ( opcusuario){
                                        case 1 :
                                            System.out.println("Añadir");
                                            System.out.println("Cuantas piezas desa pedir al provedor");
                                            nusuario1= entrada.nextInt();
                                        break;
                                    }
                                    break; 
                            }
                            break;
                                      
                   }
                   break;
                   
                  
                case 3:
                   System.out.println("Envio a clientes");
                   System.out.println("1.  Envios");
                    System.out.println("2.- Pedidos a ditribuidor ");
                   System.out.println("3.-  Salir");
                   opcHV=entrada.nextInt();
                   switch (opcHV){
                       case 1 : 
                           System.out.println("ENVIOS");
                           System.out.println("Cliente 1: "+nombre+" "+ apellido+ " es de "+ estado+ " Compro " +totl+ " Piezas y debe "+ tot + " pesos");
                           System.out.println("");
                           opcHV=entrada.nextInt();
                            break;   
                       case 2 : 
                           System.out.println("Pedidos a distribuidor");
                           break; 
                       
                   }
                   
                    break;
            }
            
            
        }else if (usuario.equals(us2) && con == contra2 ) {
            System.out.println("BIENVENIDO GABIPRO777");
             System.out.println("Ingresa la opcion que deseas realizar");
            System.out.println("1- Comprar refaciones");
            System.out.println("2- Ingresar al inventario ");
            System.out.println("3- Envios a los clientes ");
            System.out.println("4- Salir");
            opc = entrada.nextInt();
            
            
            switch (opc){
                
                case 1 :
                    //opcR=0;
                    
                    
                    System.out.println("Que tipo de refaciones te gustaria comprar");
                    System.out.println("1- Camiones ");
                    System.out.println("2- Tractores ");
                    System.out.println("3- Autobuses");
                    System.out.println("4- Salir");
                    opcR=entrada.nextInt();
                    
                    
                    switch(opcR){
                        case 1:
                            System.out.println("Que piezas necesitas?");
                            System.out.println("1.Frenos");
                            System.out.println("2.Piezas de motor");
                            System.out.println("3.Piezas de transmision");
                            System.out.println("4.Salir");
                            opcCAM=entrada.nextInt();
                                switch (opcCAM){
                                    
                                    case 1 : 
                                        System.out.println("Frenos");
                                        System.out.println("Que marca busca de camion");
                                        frenosU = entrada.next();
                                        if(frenosU.equals(frenosv)){
                                            System.out.println("MARCA VOLVO ENCONTRADA FAVOR DE DIGITAR EL AÑO MODELO DEL CAMION");
                                            System.out.println("año");    
                                            año = entrada.nextInt();
                                            System.out.println("Modelo");
                                            modelo = entrada.next();
                                            if(modeloV.equals(modelo)&& año >=2014 && año <= 2016){
                                                System.out.println("Modelo encontrado VOLVO VNL630 2014 a 2016 tenemos disponibles  :  " +balatasvolvo + " piezas");
                                                System.out.println("Cuantas necesita ");
                                                nusuario1 = entrada.nextInt();
                                                balatasvolvo = balatasvolvo - nusuario1 ;
                                                carr1 = nusuario1 ;
                                                
                                                System.out.println("");
                                                System.out.println("1.- Agregar al carrito ");
                                                System.out.println("2.- Regresar y comprar mas ");
                                                agcarr = entrada.nextInt();
                                           
                                                switch(agcarr){
                                                    case 1 : 
                                                        System.out.println("Agregar al carrito ");
                                                       
                                                        
                                                }
                                            }else  if (modeloV2.equals(modelo) && año >= 2012 && año <= 2014){
                                                System.out.println("Modelo encontrado Volvo  Vnl64t-630 2012 a 2014 tenemos disponibles " + balatasvolvo2 + " piezas ");
                                                System.out.println("Cuantas necesita");
                                                nusuario1 = entrada.nextInt();
                                                balatasvolvo2 = balatasvolvo2 - nusuario1 ;
                                                carr2 = nusuario1 ;
                                                System.out.println("");
                                                System.out.println("1.- Agregar al carrito ");
                                                System.out.println("2.- Regresar y comprar mas ");
                                                System.out.println("");
                                                switch(agcarr){
                                                    case 1 : 
                                                        System.out.println("Agregar al carrito ");
                                               } 
                                            }else if (modeloV3.equals(modelo)&& año>= 2021 && año <= 2023 ){
                                                System.out.println("Modelo Encontrado Volvo FH-540  año 2021  a 2023 "+ balatasvolvo3+" piezas " );
                                                System.out.println("Cuantas piezas necesitas ");
                                                nusuario1 = entrada.nextInt();
                                                balatasvolvo3 = balatasvolvo3 - nusuario1;
                                                carr3 = nusuario1 ;
                                                System.out.println("");
                                            }else {
                                                System.out.println("Modelo no encontrado ");
                                                
                                            }
                                            
                                        }else if (frenosU.equals(frenosMr)){
                                                System.out.println("Modelo encontrado Mercedes benz");
                                                System.out.println("Ingrese el modelo de su camion");
                                                modelo = entrada.next();
                                                System.out.println("Ingrese el año de su camion");
                                                año = entrada.nextInt();
                                                if (modeloMr.equalsIgnoreCase(modelo) && año >= 2016 && año <= 2019){
                                                    System.out.println("Modelo encontrado Mercedes-Benz freightliner 2016 a 2019 tenemos "+ balatasmb+ " Piezas");
                                                    System.out.println("Cuantas piezas necesita ?");
                                                    nusuario1 = entrada.nextInt();
                                                    balatasmb = balatasmb - nusuario1;
                                                    carr4 = nusuario1 ;
                                                    System.out.println("");
                                                }else if (modelomb2.equals(modelo)&& año == 2009){
                                                    System.out.println("Modelo encontrado Mercedes-Benz L 1624 2009 tenemos "+ balatasmb2+ "piezas");
                                                    System.out.println("Cuantas piezas necesitas");
                                                    nusuario1 = entrada.nextInt();
                                                    balatasmb2 = balatasmb2 - nusuario1;
                                                    carr5 = nusuario1 ;
                                                    System.out.println("");
                                                }else if (modelomb3.equals(modelo)&&año >= 2009 && año <= 2014){
                                                    System.out.println("Modelo encontrado Camion Mercedes-Benz Atego 2425 tenemos "+ balatasmb3+ " piezas ");
                                                    System.out.println("Cuantas piezas necesitas ");
                                                    nusuario1 = entrada.nextInt();
                                                    balatasmb3 = balatasmb3 - nusuario1 ;
                                                    carr6 = nusuario1 ;
                                                    System.out.println("");
                                                    
                                                }else{
                                                    System.out.println("Modelo no encontrado");
                                                }
                                                
                                        }else if (frenosU.equals(frenosin)) {
                                            System.out.println("Modelo encontrado  International ");
                                            System.out.println("Ingrese el modelo de su camion ");
                                            modelo = entrada.next();
                                            System.out.println("Ingrese el año de su camion ");
                                            año = entrada.nextInt();
                                            if(modelo.equalsIgnoreCase(modeloint)&& año >= 2018 && año <= 2022  ){
                                                System.out.println("Modelo encontrado International 4700 SCD DT466 de 2018 a 2022 "+ balatasint);
                                                System.out.println("Cuantas piezas necesitas ");
                                                nusuario1 = entrada.nextInt();
                                                balatasint = balatasint - nusuario1 ;
                                                carr7 = nusuario1 ;
                                                
                                            }else if (modeloint2.equals(modelo)&& año >= 2013 && año <= 2017 ) {
                                                System.out.println("Modelo encontrado International 4400 TORTON 2013 a 2017 "+ balatasint2 + " piezas ");
                                                System.out.println("Cuantas piezas necesitas ");
                                                nusuario1 = entrada.nextInt();
                                                balatasint2 = balatasint2 - nusuario1 ; 
                                                carr8 = nusuario1 ; 
                                                System.out.println("");
                                            }else if (modeloint3.equals(modelo )&& año == 2012){
                                                System.out.println("Modelo encontrado INTERNATIONAL PROSTAR+ 2013 "+ balatasint3 + " Piezas ");
                                                System.out.println("Cuantas piezas necesitas ");
                                                nusuario1 = entrada.nextInt();
                                                balatasint3 = balatasint3 - nusuario1 ;
                                                carr9 = nusuario1 ;
                                                System.out.println("");        
                                                
                                            }
                                        }else{
                                             System.out.println("Por el momento ese modelo no lo manejamos ");   
                                            }
                                            
                                        break;
                                    case 2 :
                                        System.out.println("Piezas de motor");
                                        System.out.println("Que marca de camion es ");
                                        System.out.println("1 volvo ");
                                        System.out.println("2. Mercedes-Benz");
                                        System.out.println("3. International ");
                                        System.out.println("4 Salir");
                                         opcPM = entrada.nextInt();
                                        switch (opcPM){
                                            case 1 :
                                                System.out.println("VOLVO");
                                                System.out.println("1- Bomba refrigerante ");
                                                System.out.println("2- Interruptor de ventilador termico ");
                                                System.out.println("3.- Bomba de combustible");
                                                System.out.println("4- Salir ");
                                                opcPM1 = entrada.nextInt();
                                                switch (opcPM1){
                                                    case 1:
                                                        System.out.println("Bomba refrigerante");
                                                        System.out.println("Cuantas necesitas ");
                                                        nusuario1 = entrada.nextInt();
                                                        bomba1= bomba1 - nusuario1 ;
                                                        carr10 = nusuario1 ;
                                                      break;  
                                                    case 2 : 
                                                        System.out.println("Interruptoe de ventilador termico");
                                                        System.out.println("Cuantos necesita ");
                                                        nusuario1 = entrada.nextInt();
                                                        interr = interr - nusuario1;
                                                        carr11 = nusuario1 ;
                                                        break;
                                                    case 3: 
                                                        System.out.println("Bomba de combustible ");
                                                        System.out.println("Cuanttas necesitas ");
                                                        nusuario1 = entrada.nextInt();
                                                        bombacom = bombacom - nusuario1 ;
                                                        carr12 = nusuario1 ;
                                                        break ;
                                                }
                                                break;
                                                case 2 : 
                                                System.out.println("Mercedes-Benz");                                                                                          
                                                System.out.println("1- Bomba refrigerante ");
                                                System.out.println("2- Interruptor de ventilador termico ");
                                                System.out.println("3.- Bomba de combustible");
                                                System.out.println("4- Salir ");
                                                 opcPM1 = entrada.nextInt();
                                                switch (opcPM1){
                                                    case 1 : 
                                                         System.out.println("Bomba refrigerante");
                                                         System.out.println("Cuantas necesitas ");
                                                         nusuario1 = entrada.nextInt();
                                                         bombacomb = bombacomb -nusuario1 ;
                                                         carr13 = nusuario1 ;
                                                         break;
                                                    case 2 : 
                                                        System.out.println("Interruptoe de ventilador termico");
                                                        System.out.println("Cuantos necesita ");
                                                        nusuario1 = entrada.nextInt();
                                                        interr2 = interr2 - nusuario1 ;
                                                        carr14 = nusuario1 ;
                                                        break ;
                                                    case 3 : 
                                                        System.out.println("Bomba de combustible ");
                                                        System.out.println("Cuanttas necesitas ");
                                                        nusuario1 = entrada.nextInt();
                                                        bombacom2 = bombacom2 - nusuario1 ;
                                                        carr15 = nusuario1 ;
                                                        break ;
                                                } 
                                                     
                                                 case 3 : 
                                                System.out.println("International");
                                                System.out.println("1- Bomba refrigerante ");
                                                System.out.println("2- Interruptor de ventilador termico ");
                                                System.out.println("3- Bomba de combustible");
                                                System.out.println("4- Salir");
                                                opcPM1 = entrada.nextInt();
                                                switch (opcPM1){
                                                    case 1 : 
                                                         System.out.println("Bomba refrigerante");
                                                         System.out.println("Cuantas necesitas ");
                                                         nusuario1 = entrada.nextInt();
                                                         bombaint = bombaint - nusuario1 ;
                                                         break ;
                                                    case 2 : 
                                                         System.out.println("Interruptoe de ventilador termico");
                                                         System.out.println("Cuantos necesita ");
                                                         nusuario1 = entrada.nextInt();
                                                         interr3 = interr3 - nusuario1 ;
                                                         carr16 = nusuario1 ;
                                                         break ; 
                                                    case 3 : 
                                                         System.out.println("Bomba de combustible ");
                                                         System.out.println("Cuanttas necesitas ");
                                                         nusuario1 = entrada.nextInt(); 
                                                         bombacom3 = bombacom3 - nusuario1;
                                                         carr17 = nusuario1 ;
                                                         break;
                                                }
                                            
                                        }
                                          break;
                                    case 3 :
                                        System.out.println("Piezas de transmision para camiones ");
                                        System.out.println("Selecione la marca ");
                                        System.out.println("1.- Volvo");
                                        System.out.println("2.- Mercedes-Benz");
                                        System.out.println("3.- Internatinal ");
                                        System.out.println("4.- Salir");
                                        opcusuario= entrada.nextInt ();
                                        switch (opcusuario){
                                            case 1 : 
                                                System.out.println("Volvo ");
                                                System.out.println("Selecione la refaccione");
                                                System.out.println("1.- Bomba de transmision ");
                                                System.out.println("2.- Sensores de velocidades");
                                                System.out.println("3.- cuerpo de valvulas");
                                                System.out.println("4.- Salir ");
                                                opcusuario = entrada.nextInt();
                                                switch (opcusuario){
                                                    case 1 : 
                                                        System.out.println("Cuantas Bombas necesita");
                                                        nusuario1 = entrada.nextInt();
                                                        bombas1 = bombas1 - nusuario1 ;
                                                        carr18 = nusuario1 ;
                                                        break;
                                                    case 2 :
                                                        System.out.println("Cauntos sensores de velocidad necesita ?");
                                                        nusuario1 = entrada.nextInt();
                                                        sensores1 = sensores1 - nusuario1;
                                                        carr19 = nusuario1 ;
                                                        break;
                                                    case 3 : 
                                                        System.out.println("Cuatas piezs necesita de valvulas ");
                                                        nusuario1= entrada.nextInt();
                                                        cuerpvalv = cuerpvalv - nusuario1;
                                                        carr20 = nusuario1 ;
                                                        break;
                                                }
                                            case 2 : 
                                                System.out.println("Mercedes-Benz");
                                                System.out.println("Selecione la refaccione");
                                                System.out.println("1.- Bomba de transmision ");
                                                System.out.println("2.- Sensores de velocidades");
                                                System.out.println("3.- cuerpo de valvulas");
                                                System.out.println("4.- Salir ");
                                                opcusuario = entrada.nextInt();
                                                switch (opcusuario){
                                                    case 1 :
                                                      System.out.println("Cuantas Bombas necesita");
                                                      nusuario1 = entrada.nextInt();  
                                                      bombas2 = bombas2 - nusuario1 ;
                                                      carr21 = nusuario1 ;
                                                      break;
                                                    case 2 : 
                                                      System.out.println("Cauntos sensores de velocidad necesita ?");
                                                      nusuario1 = entrada.nextInt();
                                                      sensores2 = sensores2 - nusuario1; 
                                                      carr22 = nusuario1 ;
                                                      break;
                                                    case 3 : 
                                                     System.out.println("Cuatas piezs necesita de valvulas ");
                                                        nusuario1= entrada.nextInt();
                                                        cuerpvalv2 = cuerpvalv2 - nusuario1;
                                                        carr23 = nusuario1 ;
                                                        break;   
                                                }
                                            case 3 : 
                                                System.out.println("International");
                                                System.out.println("Selecione la refaccione");
                                                System.out.println("1.- Bomba de transmision ");
                                                System.out.println("2.- Sensores de velocidades");
                                                System.out.println("3.- cuerpo de valvulas");
                                                System.out.println("4.- Salir ");   
                                                opcusuario = entrada.nextInt();
                                                switch (opcusuario){
                                                    case 1 : 
                                                      System.out.println("Cuantas Bombas necesita");
                                                      nusuario1 = entrada.nextInt();  
                                                      bombas3 = bombas3 - nusuario1 ;
                                                      carr24 = nusuario1 ;
                                                      break;
                                                    case 2 :  
                                                      System.out.println("Cauntos sensores de velocidad necesita ?");
                                                      nusuario1 = entrada.nextInt();
                                                      sensores3 = sensores3 - nusuario1; 
                                                      carr25 = nusuario1 ;
                                                      break;
                                                    case 3 : 
                                                        System.out.println("Cuatas piezs necesita de valvulas ");
                                                        nusuario1= entrada.nextInt();
                                                        cuerpvalv3 = cuerpvalv3 - nusuario1;
                                                        carr26 = nusuario1 ;
                                                        break;
                                                }
                                        }
                                        break;
     

                                }
                            break;
                    
                        case 2:
                            System.out.println("Tractores ");
                            System.out.println("1- Frenos");
                            System.out.println("2- Piezas de motor");
                            System.out.println("3- Piezas de transmision");
                            System.out.println("4- Salir");
                            tractop = entrada.nextInt();
                            switch (tractop){
                                case 1 : 
                                     System.out.println("Frenos ");
                                     System.out.println("Seleccione la marca");
                                     System.out.println("1- John Deere.");
                                     System.out.println("2- New Holland");
                                     System.out.println("3- Kubota. ");
                                     opcusuario = entrada.nextInt();
                                        switch (opcusuario){
                                            case 1 : 
                                                System.out.println("Jhon Deere frenos que tipo de frenos necesita ");
                                                System.out.println("1.- Juego de bandas de frenos ");
                                                System.out.println("2.- Freno de hoja");
                                                System.out.println("3.- Ajuste de freno ");
                                                opcusuario = entrada.nextInt();
                                                    switch (opcusuario ){
                                                        case 1 : 
                                                            System.out.println("1.- Juego de bandas de frenos");    
                                                            System.out.println("Digite cuantos desea comprar ");
                                                            nusuario1= entrada.nextInt();
                                                            bandafren = bandafren - nusuario1; 
                                                            carr27 = nusuario1 ;
                                                            break; 
                                                        case 2 : 
                                                            System.out.println("Freno de hoja ");
                                                            System.out.println("Digite cuantos desea comprar ");
                                                            nusuario1= entrada.nextInt();
                                                            frenhoja1 = frenhoja1 - nusuario1 ;
                                                            carr28 = nusuario1 ;
                                                            break; 
                                                        case 3 : 
                                                            System.out.println("Ajuste de frenos");
                                                            System.out.println("Digite cuantos desea comprar ");
                                                            nusuario1= entrada.nextInt();
                                                            ajustefren1 = ajustefren1 -  nusuario1 ; 
                                                            carr29 = nusuario1 ;
                                                            break;                                           
                                                    }
                                            case 2 : 
                                                System.out.println(" New Holland frenos que tipo de frenos necesita ");
                                                System.out.println("1.- Juego de bandas de frenos ");
                                                System.out.println("2.- Freno de hoja");
                                                System.out.println("3.- Ajuste de freno ");
                                                opcusuario = entrada.nextInt();
                                                switch (opcusuario ){
                                                    case 1 : 
                                                      System.out.println("1.- Juego de bandas de frenos");    
                                                      System.out.println("Digite cuantos desea comprar ");
                                                      nusuario1= entrada.nextInt();
                                                      bandafren2 = bandafren2 - nusuario1; 
                                                      carr30 = nusuario1 ;
                                                      break; 
                                                    case 2 : 
                                                       System.out.println("Freno de hoja ");
                                                       System.out.println("Digite cuantos desea comprar ");
                                                       nusuario1= entrada.nextInt();
                                                       frenhoja2 = frenhoja2 - nusuario1 ;
                                                       carr31 = nusuario1 ;
                                                       break; 
                                                    case 3 : 
                                                       System.out.println("Ajuste de frenos");
                                                       System.out.println("Digite cuantos desea comprar ");
                                                       nusuario1= entrada.nextInt();
                                                       ajustefren2 = ajustefren2 -  nusuario1 ; 
                                                       carr32 = nusuario1 ;
                                                       break; 
                                                    
                                                }
                                            case 3 : 
                                                System.out.println(" Kubota frenos que tipo de frenos necesita ");
                                                System.out.println("1.- Juego de bandas de frenos ");
                                                System.out.println("2.- Freno de hoja");
                                                System.out.println("3.- Ajuste de freno ");
                                                opcusuario = entrada.nextInt();
                                                 switch (opcusuario ){
                                                     case 1 : 
                                                      System.out.println("1.- Juego de bandas de frenos");    
                                                      System.out.println("Digite cuantos desea comprar ");
                                                      nusuario1= entrada.nextInt();
                                                      bandafren3 = bandafren3 - nusuario1; 
                                                      carr33 = nusuario1 ;
                                                      break;
                                                     case 2 : 
                                                       System.out.println("Freno de hoja ");
                                                       System.out.println("Digite cuantos desea comprar ");
                                                       nusuario1= entrada.nextInt();
                                                       frenhoja3 = frenhoja3 - nusuario1 ;
                                                       carr34 = nusuario1 ;
                                                       break;
                                                     case 3 : 
                                                       System.out.println("Ajuste de frenos");
                                                       System.out.println("Digite cuantos desea comprar ");
                                                       nusuario1= entrada.nextInt();
                                                       ajustefren3 = ajustefren3 -  nusuario1 ;
                                                       carr35 = nusuario1 ;
                                                       break;                                                                
                                                 }

                                        }
                                    break;
                                case 2 : 
                                     System.out.println("Piezas de motor");
                                     System.out.println("Seleccione la marca");
                                     System.out.println("1- John Deere.");
                                     System.out.println("2- New Holland");
                                     System.out.println("3- Kubota. ");
                                     opcusuario = entrada.nextInt();
                                     switch (opcusuario){
                                         case 1 : 
                                             System.out.println("John Deere");
                                             System.out.println("1.- Cigueñal ");
                                             System.out.println("2.- Arbol de levas ");
                                             System.out.println("3.- Tren de engranes frontal ");
                                             opcusuario = entrada.nextInt();
                                             switch (opcusuario){
                                                 case 1 : 
                                                     System.out.println("Cigueñal cuantas piezas desea comprar ");
                                                     nusuario1 = entrada.nextInt();
                                                     cigueñaltrack1 = cigueñaltrack1- nusuario1;
                                                     carr36 = nusuario1 ;
                                                     break; 
                                                 case 2 : 
                                                     System.out.println("Arbol de levas cuadas piezas desea comprar");
                                                     nusuario1 = entrada.nextInt();
                                                     arbollevtrac1 = arbollevtrac1 - nusuario1 ; 
                                                     carr37 = nusuario1 ;
                                                     break; 
                                                 case 3 : 
                                                     System.out.println("Tren de engranes frontal ");
                                                     nusuario1 = entrada.nextInt(); 
                                                     engranestrack1 = engranestrack1 - nusuario1 ;
                                                     carr38 = nusuario1 ;
                                                     
                                                     break; 
                                             }
                                         case 2 : 
                                             System.out.println("New Holland");
                                             System.out.println("1.- Cigueñal ");
                                             System.out.println("2.- Arbol de levas ");
                                             System.out.println("3.- Tren de engranes frontal ");
                                             opcusuario = entrada.nextInt();
                                             switch (opcusuario){
                                                 
                                                 case 1 : 
                                                     System.out.println("Cigueñal cuantas piezas desea comprar ");
                                                     nusuario1 = entrada.nextInt();
                                                     cigueñaltrack2 = cigueñaltrack2- nusuario1;
                                                     carr39 = nusuario1 ;
                                                     break; 
                                                 case 2 : 
                                                     System.out.println("Arbol de levas cuadas piezas desea comprar");
                                                     nusuario1 = entrada.nextInt(); 
                                                     arbollevtrac2 = arbollevtrac2 - nusuario1 ; 
                                                     carr40 = nusuario1 ;
                                                     break; 
                                                 case 3 : 
                                                     System.out.println("Tren de engranes frontal ");
                                                     nusuario1 = entrada.nextInt(); 
                                                     engranestrack2 = engranestrack2 - nusuario1 ; 
                                                     carr41 = nusuario1 ;
                                                     break;  
                                             }
                                         case 3 : 
                                             System.out.println("Kubota");
                                             System.out.println("1.- Cigueñal ");
                                             System.out.println("2.- Arbol de levas ");
                                             System.out.println("3.- Tren de engranes frontal ");
                                             opcusuario = entrada.nextInt();
                                             switch (opcusuario){
                                                 
                                                 case 1 : 
                                                     System.out.println("Cigueñal cuantas piezas desea comprar ");
                                                     nusuario1 = entrada.nextInt();
                                                     cigueñaltrack3 = cigueñaltrack3- nusuario1;
                                                     carr42 = nusuario1 ;
                                                     break; 
                                                 case 2 : 
                                                     System.out.println("Arbol de levas cuantas piezas desea comprar");
                                                     nusuario1 = entrada.nextInt(); 
                                                     arbollevtrac3 = arbollevtrac3 - nusuario1 ; 
                                                     carr43 = nusuario1 ;
                                                     break; 
                                                 case 3 : 
                                                     System.out.println("Tren de engranes frontal cuantas piezas desea comprar ");
                                                     nusuario1 = entrada.nextInt(); 
                                                     engranestrack3 = engranestrack3 - nusuario1 ; 
                                                     carr44 = nusuario1 ;
                                                     break;   
                                         }   
                                             break;
                                     }
                                     
                                    break;
                                case 3 :     
                                    System.out.println("Piezas de transmision ");
                                     System.out.println("Seleccione la marca");
                                     System.out.println("1- John Deere.");
                                     System.out.println(" 2- New Holland");
                                     System.out.println("3- Kubota. ");
                                     opcusuario = entrada.nextInt();
                                     switch (opcusuario){
                                         
                                         case 1 : 
                                             System.out.println("John Deere.");
                                             System.out.println("1- Placas de transmisión genuinas John Deere");
                                             System.out.println("2- John Deere Luc embrague");
                                             System.out.println("3- TRACTOR JOHN DEERE F217 TRANSMISIÓN 1a y 2da VELOCIDAD PIÑÓN DESLIZANTE PIÑÓN G");
                                             opcusuario = entrada.nextInt();
                                             switch (opcusuario){
                                                 case 1 : 
                                                  System.out.println("Placas de transmisión genuinas John Deere");
                                                     System.out.println("Cuantas desea comprar"); 
                                                     nusuario1 = entrada.nextInt();
                                                     placas1 = placas1 - nusuario1;
                                                     carr45 = nusuario1;
                                                     break; 
                                                 case 2 : 
                                                     System.out.println("Luc embrague");
                                                     System.out.println("Cuantas desea comprar");
                                                     nusuario1 = entrada.nextInt();
                                                     embrague1 = embrague1 - nusuario1 ;
                                                     carr46 = nusuario1;
                                                     break; 
                                                 case 3 : 
                                                     System.out.println("TRANSMISIÓN 1a y 2da VELOCIDAD PIÑÓN DESLIZANTE PIÑÓN G");
                                                     System.out.println(" Cuantas desea comprar ");
                                                     nusuario1 = entrada.nextInt(); 
                                                     transm1y2v1 = transm1y2v1 - nusuario1 ;
                                                     carr46 = nusuario1;
                                                     break; 
                                             }
                                             break; 
                                         case 2 : 
                                             System.out.println("New Holland");;
                                             System.out.println("1- Placas de transmisión genuinas New Holland");
                                             System.out.println("2- New Holland Luc embrague");
                                             System.out.println("3- TRACTOR New Holland F217 TRANSMISIÓN 1a y 2da VELOCIDAD PIÑÓN DESLIZANTE PIÑÓN G");
                                             opcusuario = entrada.nextInt();
                                             switch (opcusuario){
                                                 
                                                 case 1 :
                                                     System.out.println("Placas de transmisión genuinas New Holland");
                                                     System.out.println(" Cuantas desea comprar ");
                                                     nusuario1 = entrada.nextInt();
                                                     placas2 = placas2 - nusuario1;
                                                     carr47 = nusuario1;
                                                     break; 
                                                 case 2 : 
                                                     System.out.println("New Holland Luc embrague");
                                                     System.out.println(" Cuantas desea comprar ");
                                                     nusuario1 = entrada.nextInt();
                                                     embrague2 = embrague2 - nusuario1 ;
                                                     carr48 = nusuario1;
                                                     break; 
                                                 case 3 : 
                                                     System.out.println("TRACTOR New Holland F217 TRANSMISIÓN 1a y 2da VELOCIDAD PIÑÓN DESLIZANTE PIÑÓN G");
                                                     System.out.println(" Cuantas desea comprar ");
                                                     nusuario1 = entrada.nextInt();
                                                     transm1y2v2 = transm1y2v2 - nusuario1 ;
                                                     carr49 = nusuario1;
                                                     break; 
                                             }
                                                break; 
                                            
                                         case 3 : 
                                             System.out.println("Kubota");
                                             System.out.println("1- Placas de transmisión genuinas Kubota");
                                             System.out.println("2- Kubota Luc embrague");
                                             System.out.println("3- TRACTOR Kubotad F217 TRANSMISIÓN 1a y 2da VELOCIDAD PIÑÓN DESLIZANTE PIÑÓN G");
                                             opcusuario = entrada.nextInt();
                                             switch (opcusuario){
                                                 case 1 : 
                                                  System.out.println("Placas de transmisión genuinas Kubota");
                                                  System.out.println(" Cuantas desea comprar ");
                                                  nusuario1 = entrada.nextInt();   
                                                  placas3 = placas3 - nusuario1;
                                                  carr50 = nusuario1;
                                                  break; 
                                                 case 2 : 
                                                   System.out.println("KubotaLuc embrague");
                                                   System.out.println(" Cuantas desea comprar ");
                                                   nusuario1 = entrada.nextInt();
                                                   embrague3 = embrague3 - nusuario1 ;
                                                   carr51 = nusuario1;
                                                   break;   
                                                 case 3 : 
                                                    System.out.println("TRACTOR Kubota F217 TRANSMISIÓN 1a y 2da VELOCIDAD PIÑÓN DESLIZANTE PIÑÓN G");
                                                    System.out.println(" Cuantas desea comprar ");
                                                    nusuario1 = entrada.nextInt(); 
                                                    transm1y2v3 = transm1y2v3 - nusuario1 ;
                                                    carr52 = nusuario1;
                                                    break ; 
                                             }
                                     }
                                     break; }
                            break;
                        case 3 :
                            System.out.println("AUTOBUSES "); // aqui me quede 
                            System.out.println("1.Frenos");
                            System.out.println("2.Piezas de motor");
                            System.out.println("3.Piezas de transmision");
                            System.out.println("4.Salir");
                            opcAUT = entrada.nextInt();
                            
                            switch(opcAUT){
                                case 1 :
                                    System.out.println("Bienvenido a frenos !");
                                    System.out.println("Que marca busca de Autobus");
                                    frenosu3 = entrada.next();
                                    
                                    if(frenosu3.equals(frenosauv1)){
                                        System.out.println("Marca encontrada Volvo");
                                        System.out.println("Digite su modelo");
                                        modeloaut = entrada.next();
                                        System.out.println("Digite el año ");
                                        año = entrada.nextInt();
                                        if (modeloaut.equals(modautV1)&& año >= 2017 && año <= 2022  ) {
                                            System.out.println("Modelo encontrado volvo 9700 select año 2017 a 2018 "+ balataautv1 + "Piezas ");
                                            System.out.println("Cuantas piezas necesitas ");
                                            nusuario1 = entrada.nextInt();
                                            balataautv1 =  balataautv1 - nusuario1 ;
                                            carr53 = nusuario1;
                                            System.out.println("");
                                        }else if (modeloaut.equals(modautv2)&& año >= 2014 && año <= 2016 ){
                                            System.out.println("Modelo encontrado Volvo 7300 año 2014 a 2016 tenemos " + balatasautv2 + " Piezas ");
                                            System.out.println("Cuantas piezas necesitas ");
                                            nusuario1 = entrada.nextInt();
                                            balatasautv2 = balatasautv2 - nusuario1 ;
                                            carr54 = nusuario1;
                                            System.out.println("");    
                                        }else if (modeloaut.equals(modautv3)&& año >=  2006 && año <= 2010){
                                            System.out.println("Modelo encontrado volvo 7550 año 2006 a 2010  tenemos "+ balatasautv3 + " Piezas ");      
                                            System.out.println("Cuantas piezas necesita ");
                                            nusuario1 = entrada.nextInt();
                                            balatasautv3 = balatasautv3 - nusuario1 ;
                                            carr55 = nusuario1;
                                            System.out.println("");
                                            
                                        }else {
                                            System.out.println("Modelo no disponible ");
                                        }
                                        
                                    }else if (frenosu3.equals(frenosauv2)) {
                                        System.out.println("Modelo encontrado mercedes-Benz");
                                        System.out.println("Digite su modelo ");
                                        modeloaut = entrada.next();
                                        System.out.println("Digite su año ");
                                        año = entrada.nextInt();
                                        if (modeloaut.equals(modeloautM1)&& año >= 2009 && año  <= 2013 ){
                                            System.out.println("Modelo encontrado  de mercedes-Benz Torino año 2009 a 2013 tenmos disponibles  "+ balatasautMBv1 + " Piezas ");
                                            System.out.println("Cuantas piezas desea comprar ");
                                            nusuario1 = entrada.nextInt ();
                                            balatasautMBv1 = balatasautMBv1 - nusuario1 ; 
                                            carr56 = nusuario1;
                                            System.out.println("");
                                        }else if (modeloaut.equals(modeloautM2)&& año>= 2007 && año <= 2009) {
                                            System.out.println("Modelo encontrado de merecedes-Benz  0371 año 2007 a 2009 "+ balatasautMBv2+ " piezas ");
                                            System.out.println("Cuantas piezas desea comprar ");
                                            nusuario1 = entrada.nextInt();
                                            balatasautMBv2 = balatasautMBv2 - nusuario1 ;
                                            carr57 = nusuario1;
                                            System.out.println("");     
                                        }else if (modeloaut.equals(modeloautM3)&& año >= 2008 && año <= 2010 ){ 
                                            System.out.println("Modelo encontrado de mercedes-Benz  Multego OC-500 del año 2008 a 2010 " + balatasautMBv2 + " piezas ");
                                            System.out.println("Cuantas piezas desea comprar ");
                                            nusuario1 = entrada.nextInt();
                                            balatasautMBv2 = balatasautMBv2 - nusuario1 ;   
                                            carr58 = nusuario1;
                                            System.out.println("");
                                            
                                        }else {
                                            System.out.println("Modelo no disponible ");
                                        }
                                    }else if (frenosu3.equals(frenosauv3)) { 
                                        System.out.println("Modelo encontrado International");
                                        System.out.println("Digite su modelo");
                                        modeloaut = entrada.next();
                                        System.out.println("Digite su año ");
                                        año = entrada.nextInt();
                                        if (modeloaut.equals(modeloautIn1) && año >= 2012 && año <= 2015 ){
                                            System.out.println("Modelo encontrado International Dacza 4700 año 2012 a 2015 tenemos " + balatasautInt1 + " piezas ");
                                            System.out.println("Cuantas desea comprar ");
                                            nusuario1 = entrada.nextInt();
                                            balatasautInt1 = balatasautInt1 - nusuario1;
                                            carr59 = nusuario1;
                                            System.out.println("");
                                            
                                        }else if (modeloaut.equals(modeloautIn2) && año >= 2004 && año <= 2007 ){
                                            System.out.println("Modelo encontrado International DT466 Bus americano año 2004 a 2007 tenemos "+balatasautInt2+ " piezas " );
                                            System.out.println("Cuantas desea comprar ");
                                            nusuario1 = entrada.nextInt();
                                            balatasautInt2 = balatasautInt2 - nusuario1;
                                              carr60 = nusuario1;                                          
                                            System.out.println("");
                                        }else if (modeloaut.equals(modeloautIn3) && año >= 2020 && año <= 2022 ){
                                            System.out.println("Modelo encontrado International 4700FE año 2020 a 2022 tenemos "+balatasautInt3 + " Piezas");
                                            System.out.println("Cuantas desea comprar ");
                                            nusuario1 = entrada.nextInt();
                                            balatasautInt3 = balatasautInt3 - nusuario1;
                                            carr61 = nusuario1;
                                            System.out.println("");
                                        }else{
                                            System.out.println("No disponible");
                                        }
                                    }
                                case 2 : 
                                    System.out.println("Piezas de motor de autobus  Selecione su modelo "); 
                                    System.out.println("1.- Volvo ");
                                    System.out.println("2.- Mercedes-Benz");
                                    System.out.println("3.- International ");
                                    opcAUT = entrada.nextInt();
                                    
                                    switch (opcAUT){
                                        case 1 : 
                                            System.out.println("Volvo");
                                            System.out.println("1.- Bomba de aceite se adapta a: RVI C, K, KERAX, MAGNUM, T; VOLVO 9700, 9900,");
                                            System.out.println("2.- Kit de correa de cámara de sincronización + bomba de agua para Volvo XC60 XC90 V70 XC70 S60 S80 V60");
                                            System.out.println("3.- Sensor de velocidad de posición del cigüeñal del motor Dorman 904-77 OE");
                                            opcusuario = entrada.nextInt();
                                            switch (opcusuario){
                                                case 1 :
                                                    System.out.println("Bomba de aceite");
                                                    System.out.println("Cuantas desea comprar");
                                                    nusuario1 = entrada.nextInt();
                                                    bomb1 = bomb1 - nusuario1;
                                                    carr62 = nusuario1;
                                                    break;
                                                case 2 : 
                                                    System.out.println("Kit de correa ");
                                                    System.out.println("Cuantas desea comprar");
                                                    nusuario1 = entrada.nextInt();
                                                    kitcorr1= kitcorr1 - nusuario1;
                                                    carr63 = nusuario1;
                                                    break;
                                                case 3 :
                                                    System.out.println("Sensor de velocidad de posición del cigüeñal");
                                                    System.out.println("Cuantos desea comprar");
                                                    nusuario1 = entrada.nextInt();
                                                    sensefast1 = sensefast1 - nusuario1; 
                                                    carr64 = nusuario1;
                                                    break; 
                                            }
                                            break; 
                                        case 2 : 
                                            System.out.println("Mercedes-Benz");
                                            System.out.println("1.- Bomba de aceite ");
                                            System.out.println("2.- Kit de correa de cámara de sincronización + bomba de agua ");
                                            System.out.println("3.- Sensor de velocidad de posición del cigüeñal del motor Dorman");
                                            opcusuario = entrada.nextInt();
                                            switch (opcusuario){
                                                case 1 :
                                                    System.out.println("Bomba de aceite");
                                                    System.out.println("Cuantas desea comprar");
                                                    nusuario1 = entrada.nextInt();
                                                    bomb2 = bomb2 - nusuario1;
                                                    carr65 = nusuario1;
                                                    break;
                                                case 2 : 
                                                    System.out.println("Kit de correa ");
                                                    System.out.println("Cuantas desea comprar");
                                                    nusuario1 = entrada.nextInt();
                                                    kitcorr2= kitcorr2 - nusuario1;
                                                    carr66 = nusuario1;
                                                    break;
                                                case 3 :
                                                    System.out.println("Sensor de velocidad de posición del cigüeñal");
                                                    System.out.println("Cuantos desea comprar");
                                                    nusuario1 = entrada.nextInt();
                                                    sensefast2 = sensefast2 - nusuario1;
                                                    carr67 = nusuario1;
                                            break;
                                            }
                                        case 3 : 
                                            System.out.println("International ");                                           
                                            System.out.println("1.- Bomba de aceite ");
                                            System.out.println("2.- Kit de correa de cámara de sincronización + bomba de agua ");
                                            System.out.println("3.- Sensor de velocidad de posición del cigüeñal del motor Dorman");
                                            opcusuario = entrada.nextInt();
                                                    switch (opcusuario){
                                                     case 1 :
                                                         System.out.println("Bomba de aceite");
                                                         System.out.println("Cuantas desea comprar");
                                                         nusuario1 = entrada.nextInt();
                                                         bomb3 = bomb3 - nusuario1;
                                                         carr68 = nusuario1;
                                                    break;
                                                          case 2 : 
                                                          System.out.println("Kit de correa ");
                                                          System.out.println("Cuantas desea comprar");
                                                          nusuario1 = entrada.nextInt();
                                                          kitcorr3= kitcorr3 - nusuario1;
                                                          carr69 = nusuario1;
                                                    break;
                                                           case 3 :
                                                           System.out.println("Sensor de velocidad de posición del cigüeñal");
                                                           System.out.println("Cuantos desea comprar");
                                                           nusuario1 = entrada.nextInt();
                                                           sensefast3 = sensefast3 - nusuario1;
                                                           carr70 = nusuario1;
                                                    break;        
                                            }
                                            break;
                                    }
                                    break;
                                case 3:
                                    System.out.println("Piezas de Transmision Selecione la marca  ");
                                    System.out.println("1.- Volvo");
                                    System.out.println("2.- Mercedes-Benz");
                                    System.out.println("3.- International ");
                                    System.out.println("4.- Salir");
                                    opcusuario = entrada.nextInt();
                                    switch(opcusuario){
                                        
                                        case 1 : 
                                            System.out.println("Volvo Seleccione su pieza ");
                                            System.out.println("1.- Road Choice Clu embrague ");
                                            System.out.println("2.- Llave de transmision ");
                                            System.out.println("3.- Tubo de linea de lubricacion ");
                                            System.out.println("4.- salir  ");
                                            opcusuario = entrada.nextInt();
                                             switch (opcusuario){
                                                 case 1 : 
                                                     System.out.println(" Road Choice Clu embrague de  volvo  Cuantos necesita ");
                                                     nusuario1  = entrada.nextInt();
                                                     embraguev1 = embraguev1 - nusuario1 ; 
                                                     carr71 = nusuario1;
                                                     break ; 
                                                 case 2 : 
                                                     System.out.println("Llave de transmision de volov Cuantos necesitas ");
                                                     nusuario1  = entrada.nextInt();
                                                     transmision1 = transmision1 - nusuario1;
                                                     carr72 = nusuario1;
                                                     break; 
                                                 case 3 : 
                                                     System.out.println("Tubo de linea de lubricacion de volvo cuantos necesitas ");
                                                     nusuario1  = entrada.nextInt();
                                                     lubricacion1 = lubricacion1 - nusuario1; 
                                                     carr73 = nusuario1;
                                                     break;
                                             }
                                            break;
                                        case 2 : 
                                            System.out.println("Mercedes-Benz Selecione su pieza ");
                                            System.out.println("1.- Road Choice Clu embrague ");
                                            System.out.println("2.- Llave de transmision ");
                                            System.out.println("3.- Tubo de linea de lubricacion ");
                                            System.out.println("4.- salir  ");
                                            opcusuario = entrada.nextInt();
                                             switch (opcusuario){
                                                 case 1 : 
                                                     System.out.println(" Road Choice Clu embrague de  Mercedes-Benz  Cuantos necesita ");
                                                     nusuario1  = entrada.nextInt();
                                                     embraguev2 = embraguev2 - nusuario1 ; 
                                                     carr74 = nusuario1;
                                                     break ; 
                                                 case 2 : 
                                                     System.out.println("Llave de transmision de Mercedes-Benz Cuantos necesitas ");
                                                     nusuario1  = entrada.nextInt();
                                                     transmision2 = transmision2 - nusuario1;
                                                     carr75 = nusuario1;
                                                     break; 
                                                 case 3 : 
                                                     System.out.println("Tubo de linea de lubricacion de volvo cuantos necesitas");
                                                     nusuario1  = entrada.nextInt();
                                                     lubricacion2 = lubricacion2 - nusuario1;
                                                     carr75 = nusuario1;
                                                     break;
                                                 
                                             }
                                            
                                            break; 
                                        case 3 : 
                                            System.out.println("International");
                                            System.out.println("1.- Road Choice Clu embrague ");
                                            System.out.println("2.- Llave de transmision ");
                                            System.out.println("3.- Tubo de linea de lubricacion ");
                                            System.out.println("4.- salir  ");
                                            opcusuario = entrada.nextInt();
                                            switch (opcusuario){
                                                 case 1 : 
                                                     System.out.println(" Road Choice Clu embrague de International Cuantos necesita ");
                                                     nusuario1  = entrada.nextInt();
                                                     embraguev3 = embraguev3 - nusuario1 ; 
                                                     carr76 = nusuario1;
                                                     break ; 
                                                 case 2 : 
                                                     System.out.println("Llave de transmision de International Cuantos necesitas ");
                                                     nusuario1  = entrada.nextInt();
                                                     transmision3 = transmision3 - nusuario1;
                                                     carr77 = nusuario1;
                                                     break; 
                                                 case 3 : 
                                                     System.out.println("Tubo de linea de lubricacion de International cuantos necesitas");
                                                     nusuario1  = entrada.nextInt();
                                                     lubricacion3 = lubricacion3 - nusuario1;
                                                     carr78 = nusuario1;
                                                     break;
                                        }
                                    }
                            }
                        default:
                        
                    }
                    
                case 2:
                   System.out.println("INVENTARIO y VENTAS ");
                   System.out.println("1.- Carrito de compras ");
                   System.out.println("2.-  Checar inventario");
                   System.out.println("3.- Salir");
                   opcI=entrada.nextInt();
                   switch (opcI){
                        case 1 : 
                           System.out.println("CARRITO DE COMPRAS");
                            totl = carr1 + carr2+ carr3+ carr4+ carr5+ carr6+ carr7+ carr8+ carr9+ carr10+ carr11+ carr12+ carr13+ carr14+ carr15+ carr16+ carr17 + carr18+ carr19+ carr20+carr21+ carr22+ carr23+ carr24+carr25+carr26+carr27+carr28+carr29+carr30+carr31+carr32+carr33+carr34+carr35+
                            carr36+carr37+carr38+carr39+carr40+carr41+carr42+carr43+carr44+carr45+carr46+carr47+carr48+carr49+carr50+carr51+carr52+carr53+carr54+carr58+carr59+carr60+carr61+ carr62+ carr63+ carr64+carr65+carr66+carr67+carr68+carr69+carr70+carr71+carr72+carr73+carr74+carr75; 
                            System.out.println("Tienes en tu carrito de compras "+(totl- totldelte)+" piezas por pagar");
                            System.out.println("1.- Proceder a facturar y enviar");
                            System.out.println("2.- eliminar compras "); 
                            System.out.println("3.- Salir ");
                            opcusuario = entrada.nextInt();
                            tot = totl * 222;
                            switch (opcusuario){
                                case 1 : 
                                    System.out.println("Facturacion y envio");    
                                    System.out.println("Escribe tu nombre");
                                    nombre= entrada.next();
                                    System.out.println("Escribe tu apellido");
                                    apellido = entrada.next();
                                    System.out.println("Escribe tu Estado ");
                                    estado = entrada.next();
                                    System.out.println("Listo pedido registrado");
                                   
                                   break;
                                case 2 : 
                                    System.out.println("Seguro quiere eliminar");
                                    System.out.println("1. Si");
                                    System.out.println("2. no ");
                                    opcusuario = entrada.nextInt();
                                    switch(opcusuario){
                                        case 1:
                                            System.out.println("Eliminado");
                                            totldelte = totl;
                                    //totl = carr1 - carr2- carr3-carr4- carr5- carr6- carr7-carr8- carr9- carr10- carr11- carr12- carr13- carr14- carr15-carr16- carr17 - carr18- carr19- carr20-carr21- carr22- carr23- carr24-carr25-carr26-carr27-carr28-carr29-carr30-carr31-carr32-carr33-carr34-carr35-
                          //  carr36-carr37-carr38-carr39-carr40-carr41-carr42-carr43-carr44-carr45-carr46-carr47-carr48-carr49-carr50-carr51-carr52-carr53-carr54-carr58-carr59-carr60-carr61- carr62- carr63- carr64-carr65-carr66-carr67-carr68-carr69-carr70-carr71-carr72-carr73-carr74-carr75;
                                    break;
                                    }
                                break;    
                            }
                           break;
                        case 2 :
                            System.out.println("INVENTARIO"); 
                            System.out.println("Selecciona el modelo");
                            System.out.println("1.- volvo");
                            System.out.println("2.- Mercedes-Benz");
                            System.out.println("3.- international");
                            System.out.println("4.- John Deere");
                            System.out.println("5.- New Holland");
                            System.out.println("6.- Kubota");
                            System.out.println("EXIT");
                            opcusuario = entrada.nextInt();
                            switch (opcusuario){
                                case 1:
                                    System.out.println("VOLVO");
                                    System.out.println("tienes "+ balatasvolvo2+" Balatas");
                                    System.out.println("Tienes "+balatasvolvo + " Balatas ");
                                    System.out.println("Tienes "+bomba1+ " Bomba volvo" );
                                    System.out.println("Tienes "+ interr+ " piezas interr");
                                    System.out.println("1.-  Añadir             ");
                                    System.out.println("2-  Salir");
                                    opcusuario = entrada.nextInt();
                                    switch ( opcusuario){
                                        case 1 :
                                            System.out.println("Añadir");
                                            System.out.println("Cuantas piezas desa pedir al provedor");
                                            nusuario1= entrada.nextInt();
                                            break;
                                    }
                                    break;
                                case 2 : 
                                    System.out.println("Mercedes-Benz");
                                    System.out.println("Tienes "+balatasmb + " balatas " );
                                    System.out.println("Tienes "+bombacomb+ "bombas ");
                                    System.out.println("Tienes "+interr2+ " Iterruptores ");
                                    System.out.println("1.- Añadir mas ");
                                    System.out.println("2.- Salir");
                                    opcusuario = entrada.nextInt();
                                    switch ( opcusuario){
                                        case 1 :
                                            System.out.println("Añadir");
                                            System.out.println("Cuantas piezas desa pedir al provedor");
                                            nusuario1= entrada.nextInt();
                                            break;
                                        
                                    }
                                    break;
                                case 3 :
                                    System.out.println("international");
                                    System.out.println("Tines "+ bandafren+ " Bada de frenos");
                                    System.out.println("Tienes "+embraguev3+ "Embragues " );
                                    System.out.println("tienes "+ balatasint3+ " Balaztas");
                                    System.out.println("1.- Añadir mas ");
                                    System.out.println("2.- Salir");
                                    opcusuario = entrada.nextInt();
                                    switch ( opcusuario){
                                        case 1 :
                                            System.out.println("Añadir");
                                            System.out.println("Cuantas piezas desa pedir al provedor");
                                            nusuario1= entrada.nextInt();
                                            break; 
                                        
                                    }
                                    break; 
                                case 4 : 
                                    System.out.println("John Deere");
                                    System.out.println("Tienes "+ placas1+ " Placas  de transmision");
                                    System.out.println("Tienes "+ embrague1+ " Embragues ");
                                    System.out.println("Tienes "+transm1y2v1+ " piezas de trnasmicion " );
                                    System.out.println("1.- Añadir mas ");
                                    System.out.println("2.- Salir");
                                    opcusuario = entrada.nextInt();
                                    switch ( opcusuario){
                                        case 1 :
                                            System.out.println("Añadir");
                                            System.out.println("Cuantas piezas desa pedir al provedor");
                                            nusuario1= entrada.nextInt();
                                            break; 
                                        
                                    }
                                    break; 
                                case 5 : 
                                    System.out.println("New Holland");
                                    System.out.println("Tienes "+placas2+ " Placas de transmision " );
                                    System.out.println("Tienes"+ transm1y2v2+ " Treanmisiones " );
                                    System.out.println("1.- Añadir mas ");
                                    System.out.println("2.- Salir");
                                    opcusuario = entrada.nextInt();
                                    switch ( opcusuario){
                                        case 1 :
                                            System.out.println("Añadir");
                                            System.out.println("Cuantas piezas desa pedir al provedor");
                                            nusuario1= entrada.nextInt();
                                            break;
                                        
                                    }
                                    break ;
                                case 6 :
                                    System.out.println("Kubota");
                                    System.out.println("Tienes "+ placas3+ " Placas de transmision ");
                                    System.out.println("Tienes "+ embrague3+ " Embragues ");
                                    System.out.println("Tienes "+ transm1y2v3+ " Transmisiones ");
                                    System.out.println("");
                                    System.out.println("1.- Añadir mas ");
                                    System.out.println("2.- Salir");
                                    opcusuario = entrada.nextInt();
                                    switch ( opcusuario){
                                        case 1 :
                                            System.out.println("Añadir");
                                            System.out.println("Cuantas piezas desa pedir al provedor");
                                            nusuario1= entrada.nextInt();
                                        break;
                                    }
                                    break; 
                            }
                            break;
                                      
                   }
                   break;
                   
                  
                case 3:
                   System.out.println("Envio a clientes");
                   System.out.println("1.  Envios");
                    System.out.println("2.- Pedidos a ditribuidor ");
                   System.out.println("3.-  Salir");
                   opcHV=entrada.nextInt();
                   switch (opcHV){
                       case 1 : 
                           System.out.println("ENVIOS");
                           System.out.println("Cliente 1: "+nombre+" "+ apellido+ " es de "+ estado+ " Compro " +totl+ " Piezas y debe "+ tot + " pesos");
                           System.out.println("");
                           opcHV=entrada.nextInt();
                            break;   
                       case 2 : 
                           System.out.println("Pedidos a distribuidor");
                           break; 
                       
                   }
                   
                    break;
            }

            
            
        }else if (usuario.equals(us3) && con== contra3){
            System.out.println("BIENVENIDO rlofrjol58");
             System.out.println("Ingresa la opcion que deseas realizar");
            System.out.println("1- Comprar refaciones");
            System.out.println("2- Ingresar al inventario ");
            System.out.println("3- Envios a los clientes ");
            System.out.println("4- Salir");
            opc = entrada.nextInt();
            
            
            switch (opc){
                
                case 1 :
                    //opcR=0;
                    
                    
                    System.out.println("Que tipo de refaciones te gustaria comprar");
                    System.out.println("1- Camiones ");
                    System.out.println("2- Tractores ");
                    System.out.println("3- Autobuses");
                    System.out.println("4- Salir");
                    opcR=entrada.nextInt();
                    
                    
                    switch(opcR){
                        case 1:
                            System.out.println("Que piezas necesitas?");
                            System.out.println("1.Frenos");
                            System.out.println("2.Piezas de motor");
                            System.out.println("3.Piezas de transmision");
                            System.out.println("4.Salir");
                            opcCAM=entrada.nextInt();
                                switch (opcCAM){
                                    
                                    case 1 : 
                                        System.out.println("Frenos");
                                        System.out.println("Que marca busca de camion");
                                        frenosU = entrada.next();
                                        if(frenosU.equals(frenosv)){
                                            System.out.println("MARCA VOLVO ENCONTRADA FAVOR DE DIGITAR EL AÑO MODELO DEL CAMION");
                                            System.out.println("año");    
                                            año = entrada.nextInt();
                                            System.out.println("Modelo");
                                            modelo = entrada.next();
                                            if(modeloV.equals(modelo)&& año >=2014 && año <= 2016){
                                                System.out.println("Modelo encontrado VOLVO VNL630 2014 a 2016 tenemos disponibles  :  " +balatasvolvo + " piezas");
                                                System.out.println("Cuantas necesita ");
                                                nusuario1 = entrada.nextInt();
                                                balatasvolvo = balatasvolvo - nusuario1 ;
                                                carr1 = nusuario1 ;
                                                
                                                System.out.println("");
                                                System.out.println("1.- Agregar al carrito ");
                                                System.out.println("2.- Regresar y comprar mas ");
                                                agcarr = entrada.nextInt();
                                           
                                                switch(agcarr){
                                                    case 1 : 
                                                        System.out.println("Agregar al carrito ");
                                                       
                                                        
                                                }
                                            }else  if (modeloV2.equals(modelo) && año >= 2012 && año <= 2014){
                                                System.out.println("Modelo encontrado Volvo  Vnl64t-630 2012 a 2014 tenemos disponibles " + balatasvolvo2 + " piezas ");
                                                System.out.println("Cuantas necesita");
                                                nusuario1 = entrada.nextInt();
                                                balatasvolvo2 = balatasvolvo2 - nusuario1 ;
                                                carr2 = nusuario1 ;
                                                System.out.println("");
                                                System.out.println("1.- Agregar al carrito ");
                                                System.out.println("2.- Regresar y comprar mas ");
                                                System.out.println("");
                                                switch(agcarr){
                                                    case 1 : 
                                                        System.out.println("Agregar al carrito ");
                                               } 
                                            }else if (modeloV3.equals(modelo)&& año>= 2021 && año <= 2023 ){
                                                System.out.println("Modelo Encontrado Volvo FH-540  año 2021  a 2023 "+ balatasvolvo3+" piezas " );
                                                System.out.println("Cuantas piezas necesitas ");
                                                nusuario1 = entrada.nextInt();
                                                balatasvolvo3 = balatasvolvo3 - nusuario1;
                                                carr3 = nusuario1 ;
                                                System.out.println("");
                                            }else {
                                                System.out.println("Modelo no encontrado ");
                                                
                                            }
                                            
                                        }else if (frenosU.equals(frenosMr)){
                                                System.out.println("Modelo encontrado Mercedes benz");
                                                System.out.println("Ingrese el modelo de su camion");
                                                modelo = entrada.next();
                                                System.out.println("Ingrese el año de su camion");
                                                año = entrada.nextInt();
                                                if (modeloMr.equalsIgnoreCase(modelo) && año >= 2016 && año <= 2019){
                                                    System.out.println("Modelo encontrado Mercedes-Benz freightliner 2016 a 2019 tenemos "+ balatasmb+ " Piezas");
                                                    System.out.println("Cuantas piezas necesita ?");
                                                    nusuario1 = entrada.nextInt();
                                                    balatasmb = balatasmb - nusuario1;
                                                    carr4 = nusuario1 ;
                                                    System.out.println("");
                                                }else if (modelomb2.equals(modelo)&& año == 2009){
                                                    System.out.println("Modelo encontrado Mercedes-Benz L 1624 2009 tenemos "+ balatasmb2+ "piezas");
                                                    System.out.println("Cuantas piezas necesitas");
                                                    nusuario1 = entrada.nextInt();
                                                    balatasmb2 = balatasmb2 - nusuario1;
                                                    carr5 = nusuario1 ;
                                                    System.out.println("");
                                                }else if (modelomb3.equals(modelo)&&año >= 2009 && año <= 2014){
                                                    System.out.println("Modelo encontrado Camion Mercedes-Benz Atego 2425 tenemos "+ balatasmb3+ " piezas ");
                                                    System.out.println("Cuantas piezas necesitas ");
                                                    nusuario1 = entrada.nextInt();
                                                    balatasmb3 = balatasmb3 - nusuario1 ;
                                                    carr6 = nusuario1 ;
                                                    System.out.println("");
                                                    
                                                }else{
                                                    System.out.println("Modelo no encontrado");
                                                }
                                                
                                        }else if (frenosU.equals(frenosin)) {
                                            System.out.println("Modelo encontrado  International ");
                                            System.out.println("Ingrese el modelo de su camion ");
                                            modelo = entrada.next();
                                            System.out.println("Ingrese el año de su camion ");
                                            año = entrada.nextInt();
                                            if(modelo.equalsIgnoreCase(modeloint)&& año >= 2018 && año <= 2022  ){
                                                System.out.println("Modelo encontrado International 4700 SCD DT466 de 2018 a 2022 "+ balatasint);
                                                System.out.println("Cuantas piezas necesitas ");
                                                nusuario1 = entrada.nextInt();
                                                balatasint = balatasint - nusuario1 ;
                                                carr7 = nusuario1 ;
                                                
                                            }else if (modeloint2.equals(modelo)&& año >= 2013 && año <= 2017 ) {
                                                System.out.println("Modelo encontrado International 4400 TORTON 2013 a 2017 "+ balatasint2 + " piezas ");
                                                System.out.println("Cuantas piezas necesitas ");
                                                nusuario1 = entrada.nextInt();
                                                balatasint2 = balatasint2 - nusuario1 ; 
                                                carr8 = nusuario1 ; 
                                                System.out.println("");
                                            }else if (modeloint3.equals(modelo )&& año == 2012){
                                                System.out.println("Modelo encontrado INTERNATIONAL PROSTAR+ 2013 "+ balatasint3 + " Piezas ");
                                                System.out.println("Cuantas piezas necesitas ");
                                                nusuario1 = entrada.nextInt();
                                                balatasint3 = balatasint3 - nusuario1 ;
                                                carr9 = nusuario1 ;
                                                System.out.println("");        
                                                
                                            }
                                        }else{
                                             System.out.println("Por el momento ese modelo no lo manejamos ");   
                                            }
                                            
                                        break;
                                    case 2 :
                                        System.out.println("Piezas de motor");
                                        System.out.println("Que marca de camion es ");
                                        System.out.println("1 volvo ");
                                        System.out.println("2. Mercedes-Benz");
                                        System.out.println("3. International ");
                                        System.out.println("4 Salir");
                                         opcPM = entrada.nextInt();
                                        switch (opcPM){
                                            case 1 :
                                                System.out.println("VOLVO");
                                                System.out.println("1- Bomba refrigerante ");
                                                System.out.println("2- Interruptor de ventilador termico ");
                                                System.out.println("3.- Bomba de combustible");
                                                System.out.println("4- Salir ");
                                                opcPM1 = entrada.nextInt();
                                                switch (opcPM1){
                                                    case 1:
                                                        System.out.println("Bomba refrigerante");
                                                        System.out.println("Cuantas necesitas ");
                                                        nusuario1 = entrada.nextInt();
                                                        bomba1= bomba1 - nusuario1 ;
                                                        carr10 = nusuario1 ;
                                                      break;  
                                                    case 2 : 
                                                        System.out.println("Interruptoe de ventilador termico");
                                                        System.out.println("Cuantos necesita ");
                                                        nusuario1 = entrada.nextInt();
                                                        interr = interr - nusuario1;
                                                        carr11 = nusuario1 ;
                                                        break;
                                                    case 3: 
                                                        System.out.println("Bomba de combustible ");
                                                        System.out.println("Cuanttas necesitas ");
                                                        nusuario1 = entrada.nextInt();
                                                        bombacom = bombacom - nusuario1 ;
                                                        carr12 = nusuario1 ;
                                                        break ;
                                                }
                                                break;
                                                case 2 : 
                                                System.out.println("Mercedes-Benz");                                                                                          
                                                System.out.println("1- Bomba refrigerante ");
                                                System.out.println("2- Interruptor de ventilador termico ");
                                                System.out.println("3.- Bomba de combustible");
                                                System.out.println("4- Salir ");
                                                 opcPM1 = entrada.nextInt();
                                                switch (opcPM1){
                                                    case 1 : 
                                                         System.out.println("Bomba refrigerante");
                                                         System.out.println("Cuantas necesitas ");
                                                         nusuario1 = entrada.nextInt();
                                                         bombacomb = bombacomb -nusuario1 ;
                                                         carr13 = nusuario1 ;
                                                         break;
                                                    case 2 : 
                                                        System.out.println("Interruptoe de ventilador termico");
                                                        System.out.println("Cuantos necesita ");
                                                        nusuario1 = entrada.nextInt();
                                                        interr2 = interr2 - nusuario1 ;
                                                        carr14 = nusuario1 ;
                                                        break ;
                                                    case 3 : 
                                                        System.out.println("Bomba de combustible ");
                                                        System.out.println("Cuanttas necesitas ");
                                                        nusuario1 = entrada.nextInt();
                                                        bombacom2 = bombacom2 - nusuario1 ;
                                                        carr15 = nusuario1 ;
                                                        break ;
                                                } 
                                                     
                                                 case 3 : 
                                                System.out.println("International");
                                                System.out.println("1- Bomba refrigerante ");
                                                System.out.println("2- Interruptor de ventilador termico ");
                                                System.out.println("3- Bomba de combustible");
                                                System.out.println("4- Salir");
                                                opcPM1 = entrada.nextInt();
                                                switch (opcPM1){
                                                    case 1 : 
                                                         System.out.println("Bomba refrigerante");
                                                         System.out.println("Cuantas necesitas ");
                                                         nusuario1 = entrada.nextInt();
                                                         bombaint = bombaint - nusuario1 ;
                                                         break ;
                                                    case 2 : 
                                                         System.out.println("Interruptoe de ventilador termico");
                                                         System.out.println("Cuantos necesita ");
                                                         nusuario1 = entrada.nextInt();
                                                         interr3 = interr3 - nusuario1 ;
                                                         carr16 = nusuario1 ;
                                                         break ; 
                                                    case 3 : 
                                                         System.out.println("Bomba de combustible ");
                                                         System.out.println("Cuanttas necesitas ");
                                                         nusuario1 = entrada.nextInt(); 
                                                         bombacom3 = bombacom3 - nusuario1;
                                                         carr17 = nusuario1 ;
                                                         break;
                                                }
                                            
                                        }
                                          break;
                                    case 3 :
                                        System.out.println("Piezas de transmision para camiones ");
                                        System.out.println("Selecione la marca ");
                                        System.out.println("1.- Volvo");
                                        System.out.println("2.- Mercedes-Benz");
                                        System.out.println("3.- Internatinal ");
                                        System.out.println("4.- Salir");
                                        opcusuario= entrada.nextInt ();
                                        switch (opcusuario){
                                            case 1 : 
                                                System.out.println("Volvo ");
                                                System.out.println("Selecione la refaccione");
                                                System.out.println("1.- Bomba de transmision ");
                                                System.out.println("2.- Sensores de velocidades");
                                                System.out.println("3.- cuerpo de valvulas");
                                                System.out.println("4.- Salir ");
                                                opcusuario = entrada.nextInt();
                                                switch (opcusuario){
                                                    case 1 : 
                                                        System.out.println("Cuantas Bombas necesita");
                                                        nusuario1 = entrada.nextInt();
                                                        bombas1 = bombas1 - nusuario1 ;
                                                        carr18 = nusuario1 ;
                                                        break;
                                                    case 2 :
                                                        System.out.println("Cauntos sensores de velocidad necesita ?");
                                                        nusuario1 = entrada.nextInt();
                                                        sensores1 = sensores1 - nusuario1;
                                                        carr19 = nusuario1 ;
                                                        break;
                                                    case 3 : 
                                                        System.out.println("Cuatas piezs necesita de valvulas ");
                                                        nusuario1= entrada.nextInt();
                                                        cuerpvalv = cuerpvalv - nusuario1;
                                                        carr20 = nusuario1 ;
                                                        break;
                                                }
                                            case 2 : 
                                                System.out.println("Mercedes-Benz");
                                                System.out.println("Selecione la refaccione");
                                                System.out.println("1.- Bomba de transmision ");
                                                System.out.println("2.- Sensores de velocidades");
                                                System.out.println("3.- cuerpo de valvulas");
                                                System.out.println("4.- Salir ");
                                                opcusuario = entrada.nextInt();
                                                switch (opcusuario){
                                                    case 1 :
                                                      System.out.println("Cuantas Bombas necesita");
                                                      nusuario1 = entrada.nextInt();  
                                                      bombas2 = bombas2 - nusuario1 ;
                                                      carr21 = nusuario1 ;
                                                      break;
                                                    case 2 : 
                                                      System.out.println("Cauntos sensores de velocidad necesita ?");
                                                      nusuario1 = entrada.nextInt();
                                                      sensores2 = sensores2 - nusuario1; 
                                                      carr22 = nusuario1 ;
                                                      break;
                                                    case 3 : 
                                                     System.out.println("Cuatas piezs necesita de valvulas ");
                                                        nusuario1= entrada.nextInt();
                                                        cuerpvalv2 = cuerpvalv2 - nusuario1;
                                                        carr23 = nusuario1 ;
                                                        break;   
                                                }
                                            case 3 : 
                                                System.out.println("International");
                                                System.out.println("Selecione la refaccione");
                                                System.out.println("1.- Bomba de transmision ");
                                                System.out.println("2.- Sensores de velocidades");
                                                System.out.println("3.- cuerpo de valvulas");
                                                System.out.println("4.- Salir ");   
                                                opcusuario = entrada.nextInt();
                                                switch (opcusuario){
                                                    case 1 : 
                                                      System.out.println("Cuantas Bombas necesita");
                                                      nusuario1 = entrada.nextInt();  
                                                      bombas3 = bombas3 - nusuario1 ;
                                                      carr24 = nusuario1 ;
                                                      break;
                                                    case 2 :  
                                                      System.out.println("Cauntos sensores de velocidad necesita ?");
                                                      nusuario1 = entrada.nextInt();
                                                      sensores3 = sensores3 - nusuario1; 
                                                      carr25 = nusuario1 ;
                                                      break;
                                                    case 3 : 
                                                        System.out.println("Cuatas piezs necesita de valvulas ");
                                                        nusuario1= entrada.nextInt();
                                                        cuerpvalv3 = cuerpvalv3 - nusuario1;
                                                        carr26 = nusuario1 ;
                                                        break;
                                                }
                                        }
                                        break;
     

                                }
                            break;
                    
                        case 2:
                            System.out.println("Tractores ");
                            System.out.println("1- Frenos");
                            System.out.println("2- Piezas de motor");
                            System.out.println("3- Piezas de transmision");
                            System.out.println("4- Salir");
                            tractop = entrada.nextInt();
                            switch (tractop){
                                case 1 : 
                                     System.out.println("Frenos ");
                                     System.out.println("Seleccione la marca");
                                     System.out.println("1- John Deere.");
                                     System.out.println("2- New Holland");
                                     System.out.println("3- Kubota. ");
                                     opcusuario = entrada.nextInt();
                                        switch (opcusuario){
                                            case 1 : 
                                                System.out.println("Jhon Deere frenos que tipo de frenos necesita ");
                                                System.out.println("1.- Juego de bandas de frenos ");
                                                System.out.println("2.- Freno de hoja");
                                                System.out.println("3.- Ajuste de freno ");
                                                opcusuario = entrada.nextInt();
                                                    switch (opcusuario ){
                                                        case 1 : 
                                                            System.out.println("1.- Juego de bandas de frenos");    
                                                            System.out.println("Digite cuantos desea comprar ");
                                                            nusuario1= entrada.nextInt();
                                                            bandafren = bandafren - nusuario1; 
                                                            carr27 = nusuario1 ;
                                                            break; 
                                                        case 2 : 
                                                            System.out.println("Freno de hoja ");
                                                            System.out.println("Digite cuantos desea comprar ");
                                                            nusuario1= entrada.nextInt();
                                                            frenhoja1 = frenhoja1 - nusuario1 ;
                                                            carr28 = nusuario1 ;
                                                            break; 
                                                        case 3 : 
                                                            System.out.println("Ajuste de frenos");
                                                            System.out.println("Digite cuantos desea comprar ");
                                                            nusuario1= entrada.nextInt();
                                                            ajustefren1 = ajustefren1 -  nusuario1 ; 
                                                            carr29 = nusuario1 ;
                                                            break;                                           
                                                    }
                                            case 2 : 
                                                System.out.println(" New Holland frenos que tipo de frenos necesita ");
                                                System.out.println("1.- Juego de bandas de frenos ");
                                                System.out.println("2.- Freno de hoja");
                                                System.out.println("3.- Ajuste de freno ");
                                                opcusuario = entrada.nextInt();
                                                switch (opcusuario ){
                                                    case 1 : 
                                                      System.out.println("1.- Juego de bandas de frenos");    
                                                      System.out.println("Digite cuantos desea comprar ");
                                                      nusuario1= entrada.nextInt();
                                                      bandafren2 = bandafren2 - nusuario1; 
                                                      carr30 = nusuario1 ;
                                                      break; 
                                                    case 2 : 
                                                       System.out.println("Freno de hoja ");
                                                       System.out.println("Digite cuantos desea comprar ");
                                                       nusuario1= entrada.nextInt();
                                                       frenhoja2 = frenhoja2 - nusuario1 ;
                                                       carr31 = nusuario1 ;
                                                       break; 
                                                    case 3 : 
                                                       System.out.println("Ajuste de frenos");
                                                       System.out.println("Digite cuantos desea comprar ");
                                                       nusuario1= entrada.nextInt();
                                                       ajustefren2 = ajustefren2 -  nusuario1 ; 
                                                       carr32 = nusuario1 ;
                                                       break; 
                                                    
                                                }
                                            case 3 : 
                                                System.out.println(" Kubota frenos que tipo de frenos necesita ");
                                                System.out.println("1.- Juego de bandas de frenos ");
                                                System.out.println("2.- Freno de hoja");
                                                System.out.println("3.- Ajuste de freno ");
                                                opcusuario = entrada.nextInt();
                                                 switch (opcusuario ){
                                                     case 1 : 
                                                      System.out.println("1.- Juego de bandas de frenos");    
                                                      System.out.println("Digite cuantos desea comprar ");
                                                      nusuario1= entrada.nextInt();
                                                      bandafren3 = bandafren3 - nusuario1; 
                                                      carr33 = nusuario1 ;
                                                      break;
                                                     case 2 : 
                                                       System.out.println("Freno de hoja ");
                                                       System.out.println("Digite cuantos desea comprar ");
                                                       nusuario1= entrada.nextInt();
                                                       frenhoja3 = frenhoja3 - nusuario1 ;
                                                       carr34 = nusuario1 ;
                                                       break;
                                                     case 3 : 
                                                       System.out.println("Ajuste de frenos");
                                                       System.out.println("Digite cuantos desea comprar ");
                                                       nusuario1= entrada.nextInt();
                                                       ajustefren3 = ajustefren3 -  nusuario1 ;
                                                       carr35 = nusuario1 ;
                                                       break;                                                                
                                                 }

                                        }
                                    break;
                                case 2 : 
                                     System.out.println("Piezas de motor");
                                     System.out.println("Seleccione la marca");
                                     System.out.println("1- John Deere.");
                                     System.out.println("2- New Holland");
                                     System.out.println("3- Kubota. ");
                                     opcusuario = entrada.nextInt();
                                     switch (opcusuario){
                                         case 1 : 
                                             System.out.println("John Deere");
                                             System.out.println("1.- Cigueñal ");
                                             System.out.println("2.- Arbol de levas ");
                                             System.out.println("3.- Tren de engranes frontal ");
                                             opcusuario = entrada.nextInt();
                                             switch (opcusuario){
                                                 case 1 : 
                                                     System.out.println("Cigueñal cuantas piezas desea comprar ");
                                                     nusuario1 = entrada.nextInt();
                                                     cigueñaltrack1 = cigueñaltrack1- nusuario1;
                                                     carr36 = nusuario1 ;
                                                     break; 
                                                 case 2 : 
                                                     System.out.println("Arbol de levas cuadas piezas desea comprar");
                                                     nusuario1 = entrada.nextInt();
                                                     arbollevtrac1 = arbollevtrac1 - nusuario1 ; 
                                                     carr37 = nusuario1 ;
                                                     break; 
                                                 case 3 : 
                                                     System.out.println("Tren de engranes frontal ");
                                                     nusuario1 = entrada.nextInt(); 
                                                     engranestrack1 = engranestrack1 - nusuario1 ;
                                                     carr38 = nusuario1 ;
                                                     
                                                     break; 
                                             }
                                         case 2 : 
                                             System.out.println("New Holland");
                                             System.out.println("1.- Cigueñal ");
                                             System.out.println("2.- Arbol de levas ");
                                             System.out.println("3.- Tren de engranes frontal ");
                                             opcusuario = entrada.nextInt();
                                             switch (opcusuario){
                                                 
                                                 case 1 : 
                                                     System.out.println("Cigueñal cuantas piezas desea comprar ");
                                                     nusuario1 = entrada.nextInt();
                                                     cigueñaltrack2 = cigueñaltrack2- nusuario1;
                                                     carr39 = nusuario1 ;
                                                     break; 
                                                 case 2 : 
                                                     System.out.println("Arbol de levas cuadas piezas desea comprar");
                                                     nusuario1 = entrada.nextInt(); 
                                                     arbollevtrac2 = arbollevtrac2 - nusuario1 ; 
                                                     carr40 = nusuario1 ;
                                                     break; 
                                                 case 3 : 
                                                     System.out.println("Tren de engranes frontal ");
                                                     nusuario1 = entrada.nextInt(); 
                                                     engranestrack2 = engranestrack2 - nusuario1 ; 
                                                     carr41 = nusuario1 ;
                                                     break;  
                                             }
                                         case 3 : 
                                             System.out.println("Kubota");
                                             System.out.println("1.- Cigueñal ");
                                             System.out.println("2.- Arbol de levas ");
                                             System.out.println("3.- Tren de engranes frontal ");
                                             opcusuario = entrada.nextInt();
                                             switch (opcusuario){
                                                 
                                                 case 1 : 
                                                     System.out.println("Cigueñal cuantas piezas desea comprar ");
                                                     nusuario1 = entrada.nextInt();
                                                     cigueñaltrack3 = cigueñaltrack3- nusuario1;
                                                     carr42 = nusuario1 ;
                                                     break; 
                                                 case 2 : 
                                                     System.out.println("Arbol de levas cuantas piezas desea comprar");
                                                     nusuario1 = entrada.nextInt(); 
                                                     arbollevtrac3 = arbollevtrac3 - nusuario1 ; 
                                                     carr43 = nusuario1 ;
                                                     break; 
                                                 case 3 : 
                                                     System.out.println("Tren de engranes frontal cuantas piezas desea comprar ");
                                                     nusuario1 = entrada.nextInt(); 
                                                     engranestrack3 = engranestrack3 - nusuario1 ; 
                                                     carr44 = nusuario1 ;
                                                     break;   
                                         }   
                                             break;
                                     }
                                     
                                    break;
                                case 3 :     
                                    System.out.println("Piezas de transmision ");
                                     System.out.println("Seleccione la marca");
                                     System.out.println("1- John Deere.");
                                     System.out.println(" 2- New Holland");
                                     System.out.println("3- Kubota. ");
                                     opcusuario = entrada.nextInt();
                                     switch (opcusuario){
                                         
                                         case 1 : 
                                             System.out.println("John Deere.");
                                             System.out.println("1- Placas de transmisión genuinas John Deere");
                                             System.out.println("2- John Deere Luc embrague");
                                             System.out.println("3- TRACTOR JOHN DEERE F217 TRANSMISIÓN 1a y 2da VELOCIDAD PIÑÓN DESLIZANTE PIÑÓN G");
                                             opcusuario = entrada.nextInt();
                                             switch (opcusuario){
                                                 case 1 : 
                                                  System.out.println("Placas de transmisión genuinas John Deere");
                                                     System.out.println("Cuantas desea comprar"); 
                                                     nusuario1 = entrada.nextInt();
                                                     placas1 = placas1 - nusuario1;
                                                     carr45 = nusuario1;
                                                     break; 
                                                 case 2 : 
                                                     System.out.println("Luc embrague");
                                                     System.out.println("Cuantas desea comprar");
                                                     nusuario1 = entrada.nextInt();
                                                     embrague1 = embrague1 - nusuario1 ;
                                                     carr46 = nusuario1;
                                                     break; 
                                                 case 3 : 
                                                     System.out.println("TRANSMISIÓN 1a y 2da VELOCIDAD PIÑÓN DESLIZANTE PIÑÓN G");
                                                     System.out.println(" Cuantas desea comprar ");
                                                     nusuario1 = entrada.nextInt(); 
                                                     transm1y2v1 = transm1y2v1 - nusuario1 ;
                                                     carr46 = nusuario1;
                                                     break; 
                                             }
                                             break; 
                                         case 2 : 
                                             System.out.println("New Holland");;
                                             System.out.println("1- Placas de transmisión genuinas New Holland");
                                             System.out.println("2- New Holland Luc embrague");
                                             System.out.println("3- TRACTOR New Holland F217 TRANSMISIÓN 1a y 2da VELOCIDAD PIÑÓN DESLIZANTE PIÑÓN G");
                                             opcusuario = entrada.nextInt();
                                             switch (opcusuario){
                                                 
                                                 case 1 :
                                                     System.out.println("Placas de transmisión genuinas New Holland");
                                                     System.out.println(" Cuantas desea comprar ");
                                                     nusuario1 = entrada.nextInt();
                                                     placas2 = placas2 - nusuario1;
                                                     carr47 = nusuario1;
                                                     break; 
                                                 case 2 : 
                                                     System.out.println("New Holland Luc embrague");
                                                     System.out.println(" Cuantas desea comprar ");
                                                     nusuario1 = entrada.nextInt();
                                                     embrague2 = embrague2 - nusuario1 ;
                                                     carr48 = nusuario1;
                                                     break; 
                                                 case 3 : 
                                                     System.out.println("TRACTOR New Holland F217 TRANSMISIÓN 1a y 2da VELOCIDAD PIÑÓN DESLIZANTE PIÑÓN G");
                                                     System.out.println(" Cuantas desea comprar ");
                                                     nusuario1 = entrada.nextInt();
                                                     transm1y2v2 = transm1y2v2 - nusuario1 ;
                                                     carr49 = nusuario1;
                                                     break; 
                                             }
                                                break; 
                                            
                                         case 3 : 
                                             System.out.println("Kubota");
                                             System.out.println("1- Placas de transmisión genuinas Kubota");
                                             System.out.println("2- Kubota Luc embrague");
                                             System.out.println("3- TRACTOR Kubotad F217 TRANSMISIÓN 1a y 2da VELOCIDAD PIÑÓN DESLIZANTE PIÑÓN G");
                                             opcusuario = entrada.nextInt();
                                             switch (opcusuario){
                                                 case 1 : 
                                                  System.out.println("Placas de transmisión genuinas Kubota");
                                                  System.out.println(" Cuantas desea comprar ");
                                                  nusuario1 = entrada.nextInt();   
                                                  placas3 = placas3 - nusuario1;
                                                  carr50 = nusuario1;
                                                  break; 
                                                 case 2 : 
                                                   System.out.println("KubotaLuc embrague");
                                                   System.out.println(" Cuantas desea comprar ");
                                                   nusuario1 = entrada.nextInt();
                                                   embrague3 = embrague3 - nusuario1 ;
                                                   carr51 = nusuario1;
                                                   break;   
                                                 case 3 : 
                                                    System.out.println("TRACTOR Kubota F217 TRANSMISIÓN 1a y 2da VELOCIDAD PIÑÓN DESLIZANTE PIÑÓN G");
                                                    System.out.println(" Cuantas desea comprar ");
                                                    nusuario1 = entrada.nextInt(); 
                                                    transm1y2v3 = transm1y2v3 - nusuario1 ;
                                                    carr52 = nusuario1;
                                                    break ; 
                                             }
                                     }
                                     break; }
                            break;
                        case 3 :
                            System.out.println("AUTOBUSES "); // aqui me quede 
                            System.out.println("1.Frenos");
                            System.out.println("2.Piezas de motor");
                            System.out.println("3.Piezas de transmision");
                            System.out.println("4.Salir");
                            opcAUT = entrada.nextInt();
                            
                            switch(opcAUT){
                                case 1 :
                                    System.out.println("Bienvenido a frenos !");
                                    System.out.println("Que marca busca de Autobus");
                                    frenosu3 = entrada.next();
                                    
                                    if(frenosu3.equals(frenosauv1)){
                                        System.out.println("Marca encontrada Volvo");
                                        System.out.println("Digite su modelo");
                                        modeloaut = entrada.next();
                                        System.out.println("Digite el año ");
                                        año = entrada.nextInt();
                                        if (modeloaut.equals(modautV1)&& año >= 2017 && año <= 2022  ) {
                                            System.out.println("Modelo encontrado volvo 9700 select año 2017 a 2018 "+ balataautv1 + "Piezas ");
                                            System.out.println("Cuantas piezas necesitas ");
                                            nusuario1 = entrada.nextInt();
                                            balataautv1 =  balataautv1 - nusuario1 ;
                                            carr53 = nusuario1;
                                            System.out.println("");
                                        }else if (modeloaut.equals(modautv2)&& año >= 2014 && año <= 2016 ){
                                            System.out.println("Modelo encontrado Volvo 7300 año 2014 a 2016 tenemos " + balatasautv2 + " Piezas ");
                                            System.out.println("Cuantas piezas necesitas ");
                                            nusuario1 = entrada.nextInt();
                                            balatasautv2 = balatasautv2 - nusuario1 ;
                                            carr54 = nusuario1;
                                            System.out.println("");    
                                        }else if (modeloaut.equals(modautv3)&& año >=  2006 && año <= 2010){
                                            System.out.println("Modelo encontrado volvo 7550 año 2006 a 2010  tenemos "+ balatasautv3 + " Piezas ");      
                                            System.out.println("Cuantas piezas necesita ");
                                            nusuario1 = entrada.nextInt();
                                            balatasautv3 = balatasautv3 - nusuario1 ;
                                            carr55 = nusuario1;
                                            System.out.println("");
                                            
                                        }else {
                                            System.out.println("Modelo no disponible ");
                                        }
                                        
                                    }else if (frenosu3.equals(frenosauv2)) {
                                        System.out.println("Modelo encontrado mercedes-Benz");
                                        System.out.println("Digite su modelo ");
                                        modeloaut = entrada.next();
                                        System.out.println("Digite su año ");
                                        año = entrada.nextInt();
                                        if (modeloaut.equals(modeloautM1)&& año >= 2009 && año  <= 2013 ){
                                            System.out.println("Modelo encontrado  de mercedes-Benz Torino año 2009 a 2013 tenmos disponibles  "+ balatasautMBv1 + " Piezas ");
                                            System.out.println("Cuantas piezas desea comprar ");
                                            nusuario1 = entrada.nextInt ();
                                            balatasautMBv1 = balatasautMBv1 - nusuario1 ; 
                                            carr56 = nusuario1;
                                            System.out.println("");
                                        }else if (modeloaut.equals(modeloautM2)&& año>= 2007 && año <= 2009) {
                                            System.out.println("Modelo encontrado de merecedes-Benz  0371 año 2007 a 2009 "+ balatasautMBv2+ " piezas ");
                                            System.out.println("Cuantas piezas desea comprar ");
                                            nusuario1 = entrada.nextInt();
                                            balatasautMBv2 = balatasautMBv2 - nusuario1 ;
                                            carr57 = nusuario1;
                                            System.out.println("");     
                                        }else if (modeloaut.equals(modeloautM3)&& año >= 2008 && año <= 2010 ){ 
                                            System.out.println("Modelo encontrado de mercedes-Benz  Multego OC-500 del año 2008 a 2010 " + balatasautMBv2 + " piezas ");
                                            System.out.println("Cuantas piezas desea comprar ");
                                            nusuario1 = entrada.nextInt();
                                            balatasautMBv2 = balatasautMBv2 - nusuario1 ;   
                                            carr58 = nusuario1;
                                            System.out.println("");
                                            
                                        }else {
                                            System.out.println("Modelo no disponible ");
                                        }
                                    }else if (frenosu3.equals(frenosauv3)) { 
                                        System.out.println("Modelo encontrado International");
                                        System.out.println("Digite su modelo");
                                        modeloaut = entrada.next();
                                        System.out.println("Digite su año ");
                                        año = entrada.nextInt();
                                        if (modeloaut.equals(modeloautIn1) && año >= 2012 && año <= 2015 ){
                                            System.out.println("Modelo encontrado International Dacza 4700 año 2012 a 2015 tenemos " + balatasautInt1 + " piezas ");
                                            System.out.println("Cuantas desea comprar ");
                                            nusuario1 = entrada.nextInt();
                                            balatasautInt1 = balatasautInt1 - nusuario1;
                                            carr59 = nusuario1;
                                            System.out.println("");
                                            
                                        }else if (modeloaut.equals(modeloautIn2) && año >= 2004 && año <= 2007 ){
                                            System.out.println("Modelo encontrado International DT466 Bus americano año 2004 a 2007 tenemos "+balatasautInt2+ " piezas " );
                                            System.out.println("Cuantas desea comprar ");
                                            nusuario1 = entrada.nextInt();
                                            balatasautInt2 = balatasautInt2 - nusuario1;
                                              carr60 = nusuario1;                                          
                                            System.out.println("");
                                        }else if (modeloaut.equals(modeloautIn3) && año >= 2020 && año <= 2022 ){
                                            System.out.println("Modelo encontrado International 4700FE año 2020 a 2022 tenemos "+balatasautInt3 + " Piezas");
                                            System.out.println("Cuantas desea comprar ");
                                            nusuario1 = entrada.nextInt();
                                            balatasautInt3 = balatasautInt3 - nusuario1;
                                            carr61 = nusuario1;
                                            System.out.println("");
                                        }else{
                                            System.out.println("No disponible");
                                        }
                                    }
                                case 2 : 
                                    System.out.println("Piezas de motor de autobus  Selecione su modelo "); 
                                    System.out.println("1.- Volvo ");
                                    System.out.println("2.- Mercedes-Benz");
                                    System.out.println("3.- International ");
                                    opcAUT = entrada.nextInt();
                                    
                                    switch (opcAUT){
                                        case 1 : 
                                            System.out.println("Volvo");
                                            System.out.println("1.- Bomba de aceite se adapta a: RVI C, K, KERAX, MAGNUM, T; VOLVO 9700, 9900,");
                                            System.out.println("2.- Kit de correa de cámara de sincronización + bomba de agua para Volvo XC60 XC90 V70 XC70 S60 S80 V60");
                                            System.out.println("3.- Sensor de velocidad de posición del cigüeñal del motor Dorman 904-77 OE");
                                            opcusuario = entrada.nextInt();
                                            switch (opcusuario){
                                                case 1 :
                                                    System.out.println("Bomba de aceite");
                                                    System.out.println("Cuantas desea comprar");
                                                    nusuario1 = entrada.nextInt();
                                                    bomb1 = bomb1 - nusuario1;
                                                    carr62 = nusuario1;
                                                    break;
                                                case 2 : 
                                                    System.out.println("Kit de correa ");
                                                    System.out.println("Cuantas desea comprar");
                                                    nusuario1 = entrada.nextInt();
                                                    kitcorr1= kitcorr1 - nusuario1;
                                                    carr63 = nusuario1;
                                                    break;
                                                case 3 :
                                                    System.out.println("Sensor de velocidad de posición del cigüeñal");
                                                    System.out.println("Cuantos desea comprar");
                                                    nusuario1 = entrada.nextInt();
                                                    sensefast1 = sensefast1 - nusuario1; 
                                                    carr64 = nusuario1;
                                                    break; 
                                            }
                                            break; 
                                        case 2 : 
                                            System.out.println("Mercedes-Benz");
                                            System.out.println("1.- Bomba de aceite ");
                                            System.out.println("2.- Kit de correa de cámara de sincronización + bomba de agua ");
                                            System.out.println("3.- Sensor de velocidad de posición del cigüeñal del motor Dorman");
                                            opcusuario = entrada.nextInt();
                                            switch (opcusuario){
                                                case 1 :
                                                    System.out.println("Bomba de aceite");
                                                    System.out.println("Cuantas desea comprar");
                                                    nusuario1 = entrada.nextInt();
                                                    bomb2 = bomb2 - nusuario1;
                                                    carr65 = nusuario1;
                                                    break;
                                                case 2 : 
                                                    System.out.println("Kit de correa ");
                                                    System.out.println("Cuantas desea comprar");
                                                    nusuario1 = entrada.nextInt();
                                                    kitcorr2= kitcorr2 - nusuario1;
                                                    carr66 = nusuario1;
                                                    break;
                                                case 3 :
                                                    System.out.println("Sensor de velocidad de posición del cigüeñal");
                                                    System.out.println("Cuantos desea comprar");
                                                    nusuario1 = entrada.nextInt();
                                                    sensefast2 = sensefast2 - nusuario1;
                                                    carr67 = nusuario1;
                                            break;
                                            }
                                        case 3 : 
                                            System.out.println("International ");                                           
                                            System.out.println("1.- Bomba de aceite ");
                                            System.out.println("2.- Kit de correa de cámara de sincronización + bomba de agua ");
                                            System.out.println("3.- Sensor de velocidad de posición del cigüeñal del motor Dorman");
                                            opcusuario = entrada.nextInt();
                                                    switch (opcusuario){
                                                     case 1 :
                                                         System.out.println("Bomba de aceite");
                                                         System.out.println("Cuantas desea comprar");
                                                         nusuario1 = entrada.nextInt();
                                                         bomb3 = bomb3 - nusuario1;
                                                         carr68 = nusuario1;
                                                    break;
                                                          case 2 : 
                                                          System.out.println("Kit de correa ");
                                                          System.out.println("Cuantas desea comprar");
                                                          nusuario1 = entrada.nextInt();
                                                          kitcorr3= kitcorr3 - nusuario1;
                                                          carr69 = nusuario1;
                                                    break;
                                                           case 3 :
                                                           System.out.println("Sensor de velocidad de posición del cigüeñal");
                                                           System.out.println("Cuantos desea comprar");
                                                           nusuario1 = entrada.nextInt();
                                                           sensefast3 = sensefast3 - nusuario1;
                                                           carr70 = nusuario1;
                                                    break;        
                                            }
                                            break;
                                    }
                                    break;
                                case 3:
                                    System.out.println("Piezas de Transmision Selecione la marca  ");
                                    System.out.println("1.- Volvo");
                                    System.out.println("2.- Mercedes-Benz");
                                    System.out.println("3.- International ");
                                    System.out.println("4.- Salir");
                                    opcusuario = entrada.nextInt();
                                    switch(opcusuario){
                                        
                                        case 1 : 
                                            System.out.println("Volvo Seleccione su pieza ");
                                            System.out.println("1.- Road Choice Clu embrague ");
                                            System.out.println("2.- Llave de transmision ");
                                            System.out.println("3.- Tubo de linea de lubricacion ");
                                            System.out.println("4.- salir  ");
                                            opcusuario = entrada.nextInt();
                                             switch (opcusuario){
                                                 case 1 : 
                                                     System.out.println(" Road Choice Clu embrague de  volvo  Cuantos necesita ");
                                                     nusuario1  = entrada.nextInt();
                                                     embraguev1 = embraguev1 - nusuario1 ; 
                                                     carr71 = nusuario1;
                                                     break ; 
                                                 case 2 : 
                                                     System.out.println("Llave de transmision de volov Cuantos necesitas ");
                                                     nusuario1  = entrada.nextInt();
                                                     transmision1 = transmision1 - nusuario1;
                                                     carr72 = nusuario1;
                                                     break; 
                                                 case 3 : 
                                                     System.out.println("Tubo de linea de lubricacion de volvo cuantos necesitas ");
                                                     nusuario1  = entrada.nextInt();
                                                     lubricacion1 = lubricacion1 - nusuario1; 
                                                     carr73 = nusuario1;
                                                     break;
                                             }
                                            break;
                                        case 2 : 
                                            System.out.println("Mercedes-Benz Selecione su pieza ");
                                            System.out.println("1.- Road Choice Clu embrague ");
                                            System.out.println("2.- Llave de transmision ");
                                            System.out.println("3.- Tubo de linea de lubricacion ");
                                            System.out.println("4.- salir  ");
                                            opcusuario = entrada.nextInt();
                                             switch (opcusuario){
                                                 case 1 : 
                                                     System.out.println(" Road Choice Clu embrague de  Mercedes-Benz  Cuantos necesita ");
                                                     nusuario1  = entrada.nextInt();
                                                     embraguev2 = embraguev2 - nusuario1 ; 
                                                     carr74 = nusuario1;
                                                     break ; 
                                                 case 2 : 
                                                     System.out.println("Llave de transmision de Mercedes-Benz Cuantos necesitas ");
                                                     nusuario1  = entrada.nextInt();
                                                     transmision2 = transmision2 - nusuario1;
                                                     carr75 = nusuario1;
                                                     break; 
                                                 case 3 : 
                                                     System.out.println("Tubo de linea de lubricacion de volvo cuantos necesitas");
                                                     nusuario1  = entrada.nextInt();
                                                     lubricacion2 = lubricacion2 - nusuario1;
                                                     carr75 = nusuario1;
                                                     break;
                                                 
                                             }
                                            
                                            break; 
                                        case 3 : 
                                            System.out.println("International");
                                            System.out.println("1.- Road Choice Clu embrague ");
                                            System.out.println("2.- Llave de transmision ");
                                            System.out.println("3.- Tubo de linea de lubricacion ");
                                            System.out.println("4.- salir  ");
                                            opcusuario = entrada.nextInt();
                                            switch (opcusuario){
                                                 case 1 : 
                                                     System.out.println(" Road Choice Clu embrague de International Cuantos necesita ");
                                                     nusuario1  = entrada.nextInt();
                                                     embraguev3 = embraguev3 - nusuario1 ; 
                                                     carr76 = nusuario1;
                                                     break ; 
                                                 case 2 : 
                                                     System.out.println("Llave de transmision de International Cuantos necesitas ");
                                                     nusuario1  = entrada.nextInt();
                                                     transmision3 = transmision3 - nusuario1;
                                                     carr77 = nusuario1;
                                                     break; 
                                                 case 3 : 
                                                     System.out.println("Tubo de linea de lubricacion de International cuantos necesitas");
                                                     nusuario1  = entrada.nextInt();
                                                     lubricacion3 = lubricacion3 - nusuario1;
                                                     carr78 = nusuario1;
                                                     break;
                                        }
                                    }
                            }
                        default:
                        
                    }
                    
                case 2:
                   System.out.println("INVENTARIO y VENTAS ");
                   System.out.println("1.- Carrito de compras ");
                   System.out.println("2.-  Checar inventario");
                   System.out.println("3.- Salir");
                   opcI=entrada.nextInt();
                   switch (opcI){
                        case 1 : 
                           System.out.println("CARRITO DE COMPRAS");
                            totl = carr1 + carr2+ carr3+ carr4+ carr5+ carr6+ carr7+ carr8+ carr9+ carr10+ carr11+ carr12+ carr13+ carr14+ carr15+ carr16+ carr17 + carr18+ carr19+ carr20+carr21+ carr22+ carr23+ carr24+carr25+carr26+carr27+carr28+carr29+carr30+carr31+carr32+carr33+carr34+carr35+
                            carr36+carr37+carr38+carr39+carr40+carr41+carr42+carr43+carr44+carr45+carr46+carr47+carr48+carr49+carr50+carr51+carr52+carr53+carr54+carr58+carr59+carr60+carr61+ carr62+ carr63+ carr64+carr65+carr66+carr67+carr68+carr69+carr70+carr71+carr72+carr73+carr74+carr75; 
                            System.out.println("Tienes en tu carrito de compras "+(totl- totldelte)+" piezas por pagar");
                            System.out.println("1.- Proceder a facturar y enviar");
                            System.out.println("2.- eliminar compras "); 
                            System.out.println("3.- Salir ");
                            opcusuario = entrada.nextInt();
                            tot = totl * 222;
                            switch (opcusuario){
                                case 1 : 
                                    System.out.println("Facturacion y envio");    
                                    System.out.println("Escribe tu nombre");
                                    nombre= entrada.next();
                                    System.out.println("Escribe tu apellido");
                                    apellido = entrada.next();
                                    System.out.println("Escribe tu Estado ");
                                    estado = entrada.next();
                                    System.out.println("Listo pedido registrado");
                                   
                                   break;
                                case 2 : 
                                    System.out.println("Seguro quiere eliminar");
                                    System.out.println("1. Si");
                                    System.out.println("2. no ");
                                    opcusuario = entrada.nextInt();
                                    switch(opcusuario){
                                        case 1:
                                            System.out.println("Eliminado");
                                            totldelte = totl;
                                    //totl = carr1 - carr2- carr3-carr4- carr5- carr6- carr7-carr8- carr9- carr10- carr11- carr12- carr13- carr14- carr15-carr16- carr17 - carr18- carr19- carr20-carr21- carr22- carr23- carr24-carr25-carr26-carr27-carr28-carr29-carr30-carr31-carr32-carr33-carr34-carr35-
                          //  carr36-carr37-carr38-carr39-carr40-carr41-carr42-carr43-carr44-carr45-carr46-carr47-carr48-carr49-carr50-carr51-carr52-carr53-carr54-carr58-carr59-carr60-carr61- carr62- carr63- carr64-carr65-carr66-carr67-carr68-carr69-carr70-carr71-carr72-carr73-carr74-carr75;
                                    break;
                                    }
                                break;    
                            }
                           break;
                        case 2 :
                            System.out.println("INVENTARIO"); 
                            System.out.println("Selecciona el modelo");
                            System.out.println("1.- volvo");
                            System.out.println("2.- Mercedes-Benz");
                            System.out.println("3.- international");
                            System.out.println("4.- John Deere");
                            System.out.println("5.- New Holland");
                            System.out.println("6.- Kubota");
                            System.out.println("EXIT");
                            opcusuario = entrada.nextInt();
                            switch (opcusuario){
                                case 1:
                                    System.out.println("VOLVO");
                                    System.out.println("tienes "+ balatasvolvo2+" Balatas");
                                    System.out.println("Tienes "+balatasvolvo + " Balatas ");
                                    System.out.println("Tienes "+bomba1+ " Bomba volvo" );
                                    System.out.println("Tienes "+ interr+ " piezas interr");
                                    System.out.println("1.-  Añadir             ");
                                    System.out.println("2-  Salir");
                                    opcusuario = entrada.nextInt();
                                    switch ( opcusuario){
                                        case 1 :
                                            System.out.println("Añadir");
                                            System.out.println("Cuantas piezas desa pedir al provedor");
                                            nusuario1= entrada.nextInt();
                                            break;
                                    }
                                    break;
                                case 2 : 
                                    System.out.println("Mercedes-Benz");
                                    System.out.println("Tienes "+balatasmb + " balatas " );
                                    System.out.println("Tienes "+bombacomb+ "bombas ");
                                    System.out.println("Tienes "+interr2+ " Iterruptores ");
                                    System.out.println("1.- Añadir mas ");
                                    System.out.println("2.- Salir");
                                    opcusuario = entrada.nextInt();
                                    switch ( opcusuario){
                                        case 1 :
                                            System.out.println("Añadir");
                                            System.out.println("Cuantas piezas desa pedir al provedor");
                                            nusuario1= entrada.nextInt();
                                            break;
                                        
                                    }
                                    break;
                                case 3 :
                                    System.out.println("international");
                                    System.out.println("Tines "+ bandafren+ " Bada de frenos");
                                    System.out.println("Tienes "+embraguev3+ "Embragues " );
                                    System.out.println("tienes "+ balatasint3+ " Balaztas");
                                    System.out.println("1.- Añadir mas ");
                                    System.out.println("2.- Salir");
                                    opcusuario = entrada.nextInt();
                                    switch ( opcusuario){
                                        case 1 :
                                            System.out.println("Añadir");
                                            System.out.println("Cuantas piezas desa pedir al provedor");
                                            nusuario1= entrada.nextInt();
                                            break; 
                                        
                                    }
                                    break; 
                                case 4 : 
                                    System.out.println("John Deere");
                                    System.out.println("Tienes "+ placas1+ " Placas  de transmision");
                                    System.out.println("Tienes "+ embrague1+ " Embragues ");
                                    System.out.println("Tienes "+transm1y2v1+ " piezas de trnasmicion " );
                                    System.out.println("1.- Añadir mas ");
                                    System.out.println("2.- Salir");
                                    opcusuario = entrada.nextInt();
                                    switch ( opcusuario){
                                        case 1 :
                                            System.out.println("Añadir");
                                            System.out.println("Cuantas piezas desa pedir al provedor");
                                            nusuario1= entrada.nextInt();
                                            break; 
                                        
                                    }
                                    break; 
                                case 5 : 
                                    System.out.println("New Holland");
                                    System.out.println("Tienes "+placas2+ " Placas de transmision " );
                                    System.out.println("Tienes"+ transm1y2v2+ " Treanmisiones " );
                                    System.out.println("1.- Añadir mas ");
                                    System.out.println("2.- Salir");
                                    opcusuario = entrada.nextInt();
                                    switch ( opcusuario){
                                        case 1 :
                                            System.out.println("Añadir");
                                            System.out.println("Cuantas piezas desa pedir al provedor");
                                            nusuario1= entrada.nextInt();
                                            break;
                                        
                                    }
                                    break ;
                                case 6 :
                                    System.out.println("Kubota");
                                    System.out.println("Tienes "+ placas3+ " Placas de transmision ");
                                    System.out.println("Tienes "+ embrague3+ " Embragues ");
                                    System.out.println("Tienes "+ transm1y2v3+ " Transmisiones ");
                                    System.out.println("");
                                    System.out.println("1.- Añadir mas ");
                                    System.out.println("2.- Salir");
                                    opcusuario = entrada.nextInt();
                                    switch ( opcusuario){
                                        case 1 :
                                            System.out.println("Añadir");
                                            System.out.println("Cuantas piezas desa pedir al provedor");
                                            nusuario1= entrada.nextInt();
                                        break;
                                    }
                                    break; 
                            }
                            break;
                                      
                   }
                   break;
                   
                  
                case 3:
                   System.out.println("Envio a clientes");
                   System.out.println("1.  Envios");
                    System.out.println("2.- Pedidos a ditribuidor ");
                   System.out.println("3.-  Salir");
                   opcHV=entrada.nextInt();
                   switch (opcHV){
                       case 1 : 
                           System.out.println("ENVIOS");
                           System.out.println("Cliente 1: "+nombre+" "+ apellido+ " es de "+ estado+ " Compro " +totl+ " Piezas y debe "+ tot + " pesos");
                           System.out.println("");
                           opcHV=entrada.nextInt();
                            break;   
                       case 2 : 
                           System.out.println("Pedidos a distribuidor");
                           break; 
                       
                   }
                   
                    break;
            }

            
            
        }else if(usuario.equals(us4) && con==contra4){
             System.out.println("BIENVENIDO maciasconcejal10");
              System.out.println("Ingresa la opcion que deseas realizar");
            System.out.println("1- Comprar refaciones");
            System.out.println("2- Ingresar al inventario ");
            System.out.println("3- Envios a los clientes ");
            System.out.println("4- Salir");
            opc = entrada.nextInt();
            
            
            switch (opc){
                
                case 1 :
                    //opcR=0;
                    
                    
                    System.out.println("Que tipo de refaciones te gustaria comprar");
                    System.out.println("1- Camiones ");
                    System.out.println("2- Tractores ");
                    System.out.println("3- Autobuses");
                    System.out.println("4- Salir");
                    opcR=entrada.nextInt();
                    
                    
                    switch(opcR){
                        case 1:
                            System.out.println("Que piezas necesitas?");
                            System.out.println("1.Frenos");
                            System.out.println("2.Piezas de motor");
                            System.out.println("3.Piezas de transmision");
                            System.out.println("4.Salir");
                            opcCAM=entrada.nextInt();
                                switch (opcCAM){
                                    
                                    case 1 : 
                                        System.out.println("Frenos");
                                        System.out.println("Que marca busca de camion");
                                        frenosU = entrada.next();
                                        if(frenosU.equals(frenosv)){
                                            System.out.println("MARCA VOLVO ENCONTRADA FAVOR DE DIGITAR EL AÑO MODELO DEL CAMION");
                                            System.out.println("año");    
                                            año = entrada.nextInt();
                                            System.out.println("Modelo");
                                            modelo = entrada.next();
                                            if(modeloV.equals(modelo)&& año >=2014 && año <= 2016){
                                                System.out.println("Modelo encontrado VOLVO VNL630 2014 a 2016 tenemos disponibles  :  " +balatasvolvo + " piezas");
                                                System.out.println("Cuantas necesita ");
                                                nusuario1 = entrada.nextInt();
                                                balatasvolvo = balatasvolvo - nusuario1 ;
                                                carr1 = nusuario1 ;
                                                
                                                System.out.println("");
                                                System.out.println("1.- Agregar al carrito ");
                                                System.out.println("2.- Regresar y comprar mas ");
                                                agcarr = entrada.nextInt();
                                           
                                                switch(agcarr){
                                                    case 1 : 
                                                        System.out.println("Agregar al carrito ");
                                                       
                                                        
                                                }
                                            }else  if (modeloV2.equals(modelo) && año >= 2012 && año <= 2014){
                                                System.out.println("Modelo encontrado Volvo  Vnl64t-630 2012 a 2014 tenemos disponibles " + balatasvolvo2 + " piezas ");
                                                System.out.println("Cuantas necesita");
                                                nusuario1 = entrada.nextInt();
                                                balatasvolvo2 = balatasvolvo2 - nusuario1 ;
                                                carr2 = nusuario1 ;
                                                System.out.println("");
                                                System.out.println("1.- Agregar al carrito ");
                                                System.out.println("2.- Regresar y comprar mas ");
                                                System.out.println("");
                                                switch(agcarr){
                                                    case 1 : 
                                                        System.out.println("Agregar al carrito ");
                                               } 
                                            }else if (modeloV3.equals(modelo)&& año>= 2021 && año <= 2023 ){
                                                System.out.println("Modelo Encontrado Volvo FH-540  año 2021  a 2023 "+ balatasvolvo3+" piezas " );
                                                System.out.println("Cuantas piezas necesitas ");
                                                nusuario1 = entrada.nextInt();
                                                balatasvolvo3 = balatasvolvo3 - nusuario1;
                                                carr3 = nusuario1 ;
                                                System.out.println("");
                                            }else {
                                                System.out.println("Modelo no encontrado ");
                                                
                                            }
                                            
                                        }else if (frenosU.equals(frenosMr)){
                                                System.out.println("Modelo encontrado Mercedes benz");
                                                System.out.println("Ingrese el modelo de su camion");
                                                modelo = entrada.next();
                                                System.out.println("Ingrese el año de su camion");
                                                año = entrada.nextInt();
                                                if (modeloMr.equalsIgnoreCase(modelo) && año >= 2016 && año <= 2019){
                                                    System.out.println("Modelo encontrado Mercedes-Benz freightliner 2016 a 2019 tenemos "+ balatasmb+ " Piezas");
                                                    System.out.println("Cuantas piezas necesita ?");
                                                    nusuario1 = entrada.nextInt();
                                                    balatasmb = balatasmb - nusuario1;
                                                    carr4 = nusuario1 ;
                                                    System.out.println("");
                                                }else if (modelomb2.equals(modelo)&& año == 2009){
                                                    System.out.println("Modelo encontrado Mercedes-Benz L 1624 2009 tenemos "+ balatasmb2+ "piezas");
                                                    System.out.println("Cuantas piezas necesitas");
                                                    nusuario1 = entrada.nextInt();
                                                    balatasmb2 = balatasmb2 - nusuario1;
                                                    carr5 = nusuario1 ;
                                                    System.out.println("");
                                                }else if (modelomb3.equals(modelo)&&año >= 2009 && año <= 2014){
                                                    System.out.println("Modelo encontrado Camion Mercedes-Benz Atego 2425 tenemos "+ balatasmb3+ " piezas ");
                                                    System.out.println("Cuantas piezas necesitas ");
                                                    nusuario1 = entrada.nextInt();
                                                    balatasmb3 = balatasmb3 - nusuario1 ;
                                                    carr6 = nusuario1 ;
                                                    System.out.println("");
                                                    
                                                }else{
                                                    System.out.println("Modelo no encontrado");
                                                }
                                                
                                        }else if (frenosU.equals(frenosin)) {
                                            System.out.println("Modelo encontrado  International ");
                                            System.out.println("Ingrese el modelo de su camion ");
                                            modelo = entrada.next();
                                            System.out.println("Ingrese el año de su camion ");
                                            año = entrada.nextInt();
                                            if(modelo.equalsIgnoreCase(modeloint)&& año >= 2018 && año <= 2022  ){
                                                System.out.println("Modelo encontrado International 4700 SCD DT466 de 2018 a 2022 "+ balatasint);
                                                System.out.println("Cuantas piezas necesitas ");
                                                nusuario1 = entrada.nextInt();
                                                balatasint = balatasint - nusuario1 ;
                                                carr7 = nusuario1 ;
                                                
                                            }else if (modeloint2.equals(modelo)&& año >= 2013 && año <= 2017 ) {
                                                System.out.println("Modelo encontrado International 4400 TORTON 2013 a 2017 "+ balatasint2 + " piezas ");
                                                System.out.println("Cuantas piezas necesitas ");
                                                nusuario1 = entrada.nextInt();
                                                balatasint2 = balatasint2 - nusuario1 ; 
                                                carr8 = nusuario1 ; 
                                                System.out.println("");
                                            }else if (modeloint3.equals(modelo )&& año == 2012){
                                                System.out.println("Modelo encontrado INTERNATIONAL PROSTAR+ 2013 "+ balatasint3 + " Piezas ");
                                                System.out.println("Cuantas piezas necesitas ");
                                                nusuario1 = entrada.nextInt();
                                                balatasint3 = balatasint3 - nusuario1 ;
                                                carr9 = nusuario1 ;
                                                System.out.println("");        
                                                
                                            }
                                        }else{
                                             System.out.println("Por el momento ese modelo no lo manejamos ");   
                                            }
                                            
                                        break;
                                    case 2 :
                                        System.out.println("Piezas de motor");
                                        System.out.println("Que marca de camion es ");
                                        System.out.println("1 volvo ");
                                        System.out.println("2. Mercedes-Benz");
                                        System.out.println("3. International ");
                                        System.out.println("4 Salir");
                                         opcPM = entrada.nextInt();
                                        switch (opcPM){
                                            case 1 :
                                                System.out.println("VOLVO");
                                                System.out.println("1- Bomba refrigerante ");
                                                System.out.println("2- Interruptor de ventilador termico ");
                                                System.out.println("3.- Bomba de combustible");
                                                System.out.println("4- Salir ");
                                                opcPM1 = entrada.nextInt();
                                                switch (opcPM1){
                                                    case 1:
                                                        System.out.println("Bomba refrigerante");
                                                        System.out.println("Cuantas necesitas ");
                                                        nusuario1 = entrada.nextInt();
                                                        bomba1= bomba1 - nusuario1 ;
                                                        carr10 = nusuario1 ;
                                                      break;  
                                                    case 2 : 
                                                        System.out.println("Interruptoe de ventilador termico");
                                                        System.out.println("Cuantos necesita ");
                                                        nusuario1 = entrada.nextInt();
                                                        interr = interr - nusuario1;
                                                        carr11 = nusuario1 ;
                                                        break;
                                                    case 3: 
                                                        System.out.println("Bomba de combustible ");
                                                        System.out.println("Cuanttas necesitas ");
                                                        nusuario1 = entrada.nextInt();
                                                        bombacom = bombacom - nusuario1 ;
                                                        carr12 = nusuario1 ;
                                                        break ;
                                                }
                                                break;
                                                case 2 : 
                                                System.out.println("Mercedes-Benz");                                                                                          
                                                System.out.println("1- Bomba refrigerante ");
                                                System.out.println("2- Interruptor de ventilador termico ");
                                                System.out.println("3.- Bomba de combustible");
                                                System.out.println("4- Salir ");
                                                 opcPM1 = entrada.nextInt();
                                                switch (opcPM1){
                                                    case 1 : 
                                                         System.out.println("Bomba refrigerante");
                                                         System.out.println("Cuantas necesitas ");
                                                         nusuario1 = entrada.nextInt();
                                                         bombacomb = bombacomb -nusuario1 ;
                                                         carr13 = nusuario1 ;
                                                         break;
                                                    case 2 : 
                                                        System.out.println("Interruptoe de ventilador termico");
                                                        System.out.println("Cuantos necesita ");
                                                        nusuario1 = entrada.nextInt();
                                                        interr2 = interr2 - nusuario1 ;
                                                        carr14 = nusuario1 ;
                                                        break ;
                                                    case 3 : 
                                                        System.out.println("Bomba de combustible ");
                                                        System.out.println("Cuanttas necesitas ");
                                                        nusuario1 = entrada.nextInt();
                                                        bombacom2 = bombacom2 - nusuario1 ;
                                                        carr15 = nusuario1 ;
                                                        break ;
                                                } 
                                                     
                                                 case 3 : 
                                                System.out.println("International");
                                                System.out.println("1- Bomba refrigerante ");
                                                System.out.println("2- Interruptor de ventilador termico ");
                                                System.out.println("3- Bomba de combustible");
                                                System.out.println("4- Salir");
                                                opcPM1 = entrada.nextInt();
                                                switch (opcPM1){
                                                    case 1 : 
                                                         System.out.println("Bomba refrigerante");
                                                         System.out.println("Cuantas necesitas ");
                                                         nusuario1 = entrada.nextInt();
                                                         bombaint = bombaint - nusuario1 ;
                                                         break ;
                                                    case 2 : 
                                                         System.out.println("Interruptoe de ventilador termico");
                                                         System.out.println("Cuantos necesita ");
                                                         nusuario1 = entrada.nextInt();
                                                         interr3 = interr3 - nusuario1 ;
                                                         carr16 = nusuario1 ;
                                                         break ; 
                                                    case 3 : 
                                                         System.out.println("Bomba de combustible ");
                                                         System.out.println("Cuanttas necesitas ");
                                                         nusuario1 = entrada.nextInt(); 
                                                         bombacom3 = bombacom3 - nusuario1;
                                                         carr17 = nusuario1 ;
                                                         break;
                                                }
                                            
                                        }
                                          break;
                                    case 3 :
                                        System.out.println("Piezas de transmision para camiones ");
                                        System.out.println("Selecione la marca ");
                                        System.out.println("1.- Volvo");
                                        System.out.println("2.- Mercedes-Benz");
                                        System.out.println("3.- Internatinal ");
                                        System.out.println("4.- Salir");
                                        opcusuario= entrada.nextInt ();
                                        switch (opcusuario){
                                            case 1 : 
                                                System.out.println("Volvo ");
                                                System.out.println("Selecione la refaccione");
                                                System.out.println("1.- Bomba de transmision ");
                                                System.out.println("2.- Sensores de velocidades");
                                                System.out.println("3.- cuerpo de valvulas");
                                                System.out.println("4.- Salir ");
                                                opcusuario = entrada.nextInt();
                                                switch (opcusuario){
                                                    case 1 : 
                                                        System.out.println("Cuantas Bombas necesita");
                                                        nusuario1 = entrada.nextInt();
                                                        bombas1 = bombas1 - nusuario1 ;
                                                        carr18 = nusuario1 ;
                                                        break;
                                                    case 2 :
                                                        System.out.println("Cauntos sensores de velocidad necesita ?");
                                                        nusuario1 = entrada.nextInt();
                                                        sensores1 = sensores1 - nusuario1;
                                                        carr19 = nusuario1 ;
                                                        break;
                                                    case 3 : 
                                                        System.out.println("Cuatas piezs necesita de valvulas ");
                                                        nusuario1= entrada.nextInt();
                                                        cuerpvalv = cuerpvalv - nusuario1;
                                                        carr20 = nusuario1 ;
                                                        break;
                                                }
                                            case 2 : 
                                                System.out.println("Mercedes-Benz");
                                                System.out.println("Selecione la refaccione");
                                                System.out.println("1.- Bomba de transmision ");
                                                System.out.println("2.- Sensores de velocidades");
                                                System.out.println("3.- cuerpo de valvulas");
                                                System.out.println("4.- Salir ");
                                                opcusuario = entrada.nextInt();
                                                switch (opcusuario){
                                                    case 1 :
                                                      System.out.println("Cuantas Bombas necesita");
                                                      nusuario1 = entrada.nextInt();  
                                                      bombas2 = bombas2 - nusuario1 ;
                                                      carr21 = nusuario1 ;
                                                      break;
                                                    case 2 : 
                                                      System.out.println("Cauntos sensores de velocidad necesita ?");
                                                      nusuario1 = entrada.nextInt();
                                                      sensores2 = sensores2 - nusuario1; 
                                                      carr22 = nusuario1 ;
                                                      break;
                                                    case 3 : 
                                                     System.out.println("Cuatas piezs necesita de valvulas ");
                                                        nusuario1= entrada.nextInt();
                                                        cuerpvalv2 = cuerpvalv2 - nusuario1;
                                                        carr23 = nusuario1 ;
                                                        break;   
                                                }
                                            case 3 : 
                                                System.out.println("International");
                                                System.out.println("Selecione la refaccione");
                                                System.out.println("1.- Bomba de transmision ");
                                                System.out.println("2.- Sensores de velocidades");
                                                System.out.println("3.- cuerpo de valvulas");
                                                System.out.println("4.- Salir ");   
                                                opcusuario = entrada.nextInt();
                                                switch (opcusuario){
                                                    case 1 : 
                                                      System.out.println("Cuantas Bombas necesita");
                                                      nusuario1 = entrada.nextInt();  
                                                      bombas3 = bombas3 - nusuario1 ;
                                                      carr24 = nusuario1 ;
                                                      break;
                                                    case 2 :  
                                                      System.out.println("Cauntos sensores de velocidad necesita ?");
                                                      nusuario1 = entrada.nextInt();
                                                      sensores3 = sensores3 - nusuario1; 
                                                      carr25 = nusuario1 ;
                                                      break;
                                                    case 3 : 
                                                        System.out.println("Cuatas piezs necesita de valvulas ");
                                                        nusuario1= entrada.nextInt();
                                                        cuerpvalv3 = cuerpvalv3 - nusuario1;
                                                        carr26 = nusuario1 ;
                                                        break;
                                                }
                                        }
                                        break;
     

                                }
                            break;
                    
                        case 2:
                            System.out.println("Tractores ");
                            System.out.println("1- Frenos");
                            System.out.println("2- Piezas de motor");
                            System.out.println("3- Piezas de transmision");
                            System.out.println("4- Salir");
                            tractop = entrada.nextInt();
                            switch (tractop){
                                case 1 : 
                                     System.out.println("Frenos ");
                                     System.out.println("Seleccione la marca");
                                     System.out.println("1- John Deere.");
                                     System.out.println("2- New Holland");
                                     System.out.println("3- Kubota. ");
                                     opcusuario = entrada.nextInt();
                                        switch (opcusuario){
                                            case 1 : 
                                                System.out.println("Jhon Deere frenos que tipo de frenos necesita ");
                                                System.out.println("1.- Juego de bandas de frenos ");
                                                System.out.println("2.- Freno de hoja");
                                                System.out.println("3.- Ajuste de freno ");
                                                opcusuario = entrada.nextInt();
                                                    switch (opcusuario ){
                                                        case 1 : 
                                                            System.out.println("1.- Juego de bandas de frenos");    
                                                            System.out.println("Digite cuantos desea comprar ");
                                                            nusuario1= entrada.nextInt();
                                                            bandafren = bandafren - nusuario1; 
                                                            carr27 = nusuario1 ;
                                                            break; 
                                                        case 2 : 
                                                            System.out.println("Freno de hoja ");
                                                            System.out.println("Digite cuantos desea comprar ");
                                                            nusuario1= entrada.nextInt();
                                                            frenhoja1 = frenhoja1 - nusuario1 ;
                                                            carr28 = nusuario1 ;
                                                            break; 
                                                        case 3 : 
                                                            System.out.println("Ajuste de frenos");
                                                            System.out.println("Digite cuantos desea comprar ");
                                                            nusuario1= entrada.nextInt();
                                                            ajustefren1 = ajustefren1 -  nusuario1 ; 
                                                            carr29 = nusuario1 ;
                                                            break;                                           
                                                    }
                                            case 2 : 
                                                System.out.println(" New Holland frenos que tipo de frenos necesita ");
                                                System.out.println("1.- Juego de bandas de frenos ");
                                                System.out.println("2.- Freno de hoja");
                                                System.out.println("3.- Ajuste de freno ");
                                                opcusuario = entrada.nextInt();
                                                switch (opcusuario ){
                                                    case 1 : 
                                                      System.out.println("1.- Juego de bandas de frenos");    
                                                      System.out.println("Digite cuantos desea comprar ");
                                                      nusuario1= entrada.nextInt();
                                                      bandafren2 = bandafren2 - nusuario1; 
                                                      carr30 = nusuario1 ;
                                                      break; 
                                                    case 2 : 
                                                       System.out.println("Freno de hoja ");
                                                       System.out.println("Digite cuantos desea comprar ");
                                                       nusuario1= entrada.nextInt();
                                                       frenhoja2 = frenhoja2 - nusuario1 ;
                                                       carr31 = nusuario1 ;
                                                       break; 
                                                    case 3 : 
                                                       System.out.println("Ajuste de frenos");
                                                       System.out.println("Digite cuantos desea comprar ");
                                                       nusuario1= entrada.nextInt();
                                                       ajustefren2 = ajustefren2 -  nusuario1 ; 
                                                       carr32 = nusuario1 ;
                                                       break; 
                                                    
                                                }
                                            case 3 : 
                                                System.out.println(" Kubota frenos que tipo de frenos necesita ");
                                                System.out.println("1.- Juego de bandas de frenos ");
                                                System.out.println("2.- Freno de hoja");
                                                System.out.println("3.- Ajuste de freno ");
                                                opcusuario = entrada.nextInt();
                                                 switch (opcusuario ){
                                                     case 1 : 
                                                      System.out.println("1.- Juego de bandas de frenos");    
                                                      System.out.println("Digite cuantos desea comprar ");
                                                      nusuario1= entrada.nextInt();
                                                      bandafren3 = bandafren3 - nusuario1; 
                                                      carr33 = nusuario1 ;
                                                      break;
                                                     case 2 : 
                                                       System.out.println("Freno de hoja ");
                                                       System.out.println("Digite cuantos desea comprar ");
                                                       nusuario1= entrada.nextInt();
                                                       frenhoja3 = frenhoja3 - nusuario1 ;
                                                       carr34 = nusuario1 ;
                                                       break;
                                                     case 3 : 
                                                       System.out.println("Ajuste de frenos");
                                                       System.out.println("Digite cuantos desea comprar ");
                                                       nusuario1= entrada.nextInt();
                                                       ajustefren3 = ajustefren3 -  nusuario1 ;
                                                       carr35 = nusuario1 ;
                                                       break;                                                                
                                                 }

                                        }
                                    break;
                                case 2 : 
                                     System.out.println("Piezas de motor");
                                     System.out.println("Seleccione la marca");
                                     System.out.println("1- John Deere.");
                                     System.out.println("2- New Holland");
                                     System.out.println("3- Kubota. ");
                                     opcusuario = entrada.nextInt();
                                     switch (opcusuario){
                                         case 1 : 
                                             System.out.println("John Deere");
                                             System.out.println("1.- Cigueñal ");
                                             System.out.println("2.- Arbol de levas ");
                                             System.out.println("3.- Tren de engranes frontal ");
                                             opcusuario = entrada.nextInt();
                                             switch (opcusuario){
                                                 case 1 : 
                                                     System.out.println("Cigueñal cuantas piezas desea comprar ");
                                                     nusuario1 = entrada.nextInt();
                                                     cigueñaltrack1 = cigueñaltrack1- nusuario1;
                                                     carr36 = nusuario1 ;
                                                     break; 
                                                 case 2 : 
                                                     System.out.println("Arbol de levas cuadas piezas desea comprar");
                                                     nusuario1 = entrada.nextInt();
                                                     arbollevtrac1 = arbollevtrac1 - nusuario1 ; 
                                                     carr37 = nusuario1 ;
                                                     break; 
                                                 case 3 : 
                                                     System.out.println("Tren de engranes frontal ");
                                                     nusuario1 = entrada.nextInt(); 
                                                     engranestrack1 = engranestrack1 - nusuario1 ;
                                                     carr38 = nusuario1 ;
                                                     
                                                     break; 
                                             }
                                         case 2 : 
                                             System.out.println("New Holland");
                                             System.out.println("1.- Cigueñal ");
                                             System.out.println("2.- Arbol de levas ");
                                             System.out.println("3.- Tren de engranes frontal ");
                                             opcusuario = entrada.nextInt();
                                             switch (opcusuario){
                                                 
                                                 case 1 : 
                                                     System.out.println("Cigueñal cuantas piezas desea comprar ");
                                                     nusuario1 = entrada.nextInt();
                                                     cigueñaltrack2 = cigueñaltrack2- nusuario1;
                                                     carr39 = nusuario1 ;
                                                     break; 
                                                 case 2 : 
                                                     System.out.println("Arbol de levas cuadas piezas desea comprar");
                                                     nusuario1 = entrada.nextInt(); 
                                                     arbollevtrac2 = arbollevtrac2 - nusuario1 ; 
                                                     carr40 = nusuario1 ;
                                                     break; 
                                                 case 3 : 
                                                     System.out.println("Tren de engranes frontal ");
                                                     nusuario1 = entrada.nextInt(); 
                                                     engranestrack2 = engranestrack2 - nusuario1 ; 
                                                     carr41 = nusuario1 ;
                                                     break;  
                                             }
                                         case 3 : 
                                             System.out.println("Kubota");
                                             System.out.println("1.- Cigueñal ");
                                             System.out.println("2.- Arbol de levas ");
                                             System.out.println("3.- Tren de engranes frontal ");
                                             opcusuario = entrada.nextInt();
                                             switch (opcusuario){
                                                 
                                                 case 1 : 
                                                     System.out.println("Cigueñal cuantas piezas desea comprar ");
                                                     nusuario1 = entrada.nextInt();
                                                     cigueñaltrack3 = cigueñaltrack3- nusuario1;
                                                     carr42 = nusuario1 ;
                                                     break; 
                                                 case 2 : 
                                                     System.out.println("Arbol de levas cuantas piezas desea comprar");
                                                     nusuario1 = entrada.nextInt(); 
                                                     arbollevtrac3 = arbollevtrac3 - nusuario1 ; 
                                                     carr43 = nusuario1 ;
                                                     break; 
                                                 case 3 : 
                                                     System.out.println("Tren de engranes frontal cuantas piezas desea comprar ");
                                                     nusuario1 = entrada.nextInt(); 
                                                     engranestrack3 = engranestrack3 - nusuario1 ; 
                                                     carr44 = nusuario1 ;
                                                     break;   
                                         }   
                                             break;
                                     }
                                     
                                    break;
                                case 3 :     
                                    System.out.println("Piezas de transmision ");
                                     System.out.println("Seleccione la marca");
                                     System.out.println("1- John Deere.");
                                     System.out.println(" 2- New Holland");
                                     System.out.println("3- Kubota. ");
                                     opcusuario = entrada.nextInt();
                                     switch (opcusuario){
                                         
                                         case 1 : 
                                             System.out.println("John Deere.");
                                             System.out.println("1- Placas de transmisión genuinas John Deere");
                                             System.out.println("2- John Deere Luc embrague");
                                             System.out.println("3- TRACTOR JOHN DEERE F217 TRANSMISIÓN 1a y 2da VELOCIDAD PIÑÓN DESLIZANTE PIÑÓN G");
                                             opcusuario = entrada.nextInt();
                                             switch (opcusuario){
                                                 case 1 : 
                                                  System.out.println("Placas de transmisión genuinas John Deere");
                                                     System.out.println("Cuantas desea comprar"); 
                                                     nusuario1 = entrada.nextInt();
                                                     placas1 = placas1 - nusuario1;
                                                     carr45 = nusuario1;
                                                     break; 
                                                 case 2 : 
                                                     System.out.println("Luc embrague");
                                                     System.out.println("Cuantas desea comprar");
                                                     nusuario1 = entrada.nextInt();
                                                     embrague1 = embrague1 - nusuario1 ;
                                                     carr46 = nusuario1;
                                                     break; 
                                                 case 3 : 
                                                     System.out.println("TRANSMISIÓN 1a y 2da VELOCIDAD PIÑÓN DESLIZANTE PIÑÓN G");
                                                     System.out.println(" Cuantas desea comprar ");
                                                     nusuario1 = entrada.nextInt(); 
                                                     transm1y2v1 = transm1y2v1 - nusuario1 ;
                                                     carr46 = nusuario1;
                                                     break; 
                                             }
                                             break; 
                                         case 2 : 
                                             System.out.println("New Holland");;
                                             System.out.println("1- Placas de transmisión genuinas New Holland");
                                             System.out.println("2- New Holland Luc embrague");
                                             System.out.println("3- TRACTOR New Holland F217 TRANSMISIÓN 1a y 2da VELOCIDAD PIÑÓN DESLIZANTE PIÑÓN G");
                                             opcusuario = entrada.nextInt();
                                             switch (opcusuario){
                                                 
                                                 case 1 :
                                                     System.out.println("Placas de transmisión genuinas New Holland");
                                                     System.out.println(" Cuantas desea comprar ");
                                                     nusuario1 = entrada.nextInt();
                                                     placas2 = placas2 - nusuario1;
                                                     carr47 = nusuario1;
                                                     break; 
                                                 case 2 : 
                                                     System.out.println("New Holland Luc embrague");
                                                     System.out.println(" Cuantas desea comprar ");
                                                     nusuario1 = entrada.nextInt();
                                                     embrague2 = embrague2 - nusuario1 ;
                                                     carr48 = nusuario1;
                                                     break; 
                                                 case 3 : 
                                                     System.out.println("TRACTOR New Holland F217 TRANSMISIÓN 1a y 2da VELOCIDAD PIÑÓN DESLIZANTE PIÑÓN G");
                                                     System.out.println(" Cuantas desea comprar ");
                                                     nusuario1 = entrada.nextInt();
                                                     transm1y2v2 = transm1y2v2 - nusuario1 ;
                                                     carr49 = nusuario1;
                                                     break; 
                                             }
                                                break; 
                                            
                                         case 3 : 
                                             System.out.println("Kubota");
                                             System.out.println("1- Placas de transmisión genuinas Kubota");
                                             System.out.println("2- Kubota Luc embrague");
                                             System.out.println("3- TRACTOR Kubotad F217 TRANSMISIÓN 1a y 2da VELOCIDAD PIÑÓN DESLIZANTE PIÑÓN G");
                                             opcusuario = entrada.nextInt();
                                             switch (opcusuario){
                                                 case 1 : 
                                                  System.out.println("Placas de transmisión genuinas Kubota");
                                                  System.out.println(" Cuantas desea comprar ");
                                                  nusuario1 = entrada.nextInt();   
                                                  placas3 = placas3 - nusuario1;
                                                  carr50 = nusuario1;
                                                  break; 
                                                 case 2 : 
                                                   System.out.println("KubotaLuc embrague");
                                                   System.out.println(" Cuantas desea comprar ");
                                                   nusuario1 = entrada.nextInt();
                                                   embrague3 = embrague3 - nusuario1 ;
                                                   carr51 = nusuario1;
                                                   break;   
                                                 case 3 : 
                                                    System.out.println("TRACTOR Kubota F217 TRANSMISIÓN 1a y 2da VELOCIDAD PIÑÓN DESLIZANTE PIÑÓN G");
                                                    System.out.println(" Cuantas desea comprar ");
                                                    nusuario1 = entrada.nextInt(); 
                                                    transm1y2v3 = transm1y2v3 - nusuario1 ;
                                                    carr52 = nusuario1;
                                                    break ; 
                                             }
                                     }
                                     break; }
                            break;
                        case 3 :
                            System.out.println("AUTOBUSES "); // aqui me quede 
                            System.out.println("1.Frenos");
                            System.out.println("2.Piezas de motor");
                            System.out.println("3.Piezas de transmision");
                            System.out.println("4.Salir");
                            opcAUT = entrada.nextInt();
                            
                            switch(opcAUT){
                                case 1 :
                                    System.out.println("Bienvenido a frenos !");
                                    System.out.println("Que marca busca de Autobus");
                                    frenosu3 = entrada.next();
                                    
                                    if(frenosu3.equals(frenosauv1)){
                                        System.out.println("Marca encontrada Volvo");
                                        System.out.println("Digite su modelo");
                                        modeloaut = entrada.next();
                                        System.out.println("Digite el año ");
                                        año = entrada.nextInt();
                                        if (modeloaut.equals(modautV1)&& año >= 2017 && año <= 2022  ) {
                                            System.out.println("Modelo encontrado volvo 9700 select año 2017 a 2018 "+ balataautv1 + "Piezas ");
                                            System.out.println("Cuantas piezas necesitas ");
                                            nusuario1 = entrada.nextInt();
                                            balataautv1 =  balataautv1 - nusuario1 ;
                                            carr53 = nusuario1;
                                            System.out.println("");
                                        }else if (modeloaut.equals(modautv2)&& año >= 2014 && año <= 2016 ){
                                            System.out.println("Modelo encontrado Volvo 7300 año 2014 a 2016 tenemos " + balatasautv2 + " Piezas ");
                                            System.out.println("Cuantas piezas necesitas ");
                                            nusuario1 = entrada.nextInt();
                                            balatasautv2 = balatasautv2 - nusuario1 ;
                                            carr54 = nusuario1;
                                            System.out.println("");    
                                        }else if (modeloaut.equals(modautv3)&& año >=  2006 && año <= 2010){
                                            System.out.println("Modelo encontrado volvo 7550 año 2006 a 2010  tenemos "+ balatasautv3 + " Piezas ");      
                                            System.out.println("Cuantas piezas necesita ");
                                            nusuario1 = entrada.nextInt();
                                            balatasautv3 = balatasautv3 - nusuario1 ;
                                            carr55 = nusuario1;
                                            System.out.println("");
                                            
                                        }else {
                                            System.out.println("Modelo no disponible ");
                                        }
                                        
                                    }else if (frenosu3.equals(frenosauv2)) {
                                        System.out.println("Modelo encontrado mercedes-Benz");
                                        System.out.println("Digite su modelo ");
                                        modeloaut = entrada.next();
                                        System.out.println("Digite su año ");
                                        año = entrada.nextInt();
                                        if (modeloaut.equals(modeloautM1)&& año >= 2009 && año  <= 2013 ){
                                            System.out.println("Modelo encontrado  de mercedes-Benz Torino año 2009 a 2013 tenmos disponibles  "+ balatasautMBv1 + " Piezas ");
                                            System.out.println("Cuantas piezas desea comprar ");
                                            nusuario1 = entrada.nextInt ();
                                            balatasautMBv1 = balatasautMBv1 - nusuario1 ; 
                                            carr56 = nusuario1;
                                            System.out.println("");
                                        }else if (modeloaut.equals(modeloautM2)&& año>= 2007 && año <= 2009) {
                                            System.out.println("Modelo encontrado de merecedes-Benz  0371 año 2007 a 2009 "+ balatasautMBv2+ " piezas ");
                                            System.out.println("Cuantas piezas desea comprar ");
                                            nusuario1 = entrada.nextInt();
                                            balatasautMBv2 = balatasautMBv2 - nusuario1 ;
                                            carr57 = nusuario1;
                                            System.out.println("");     
                                        }else if (modeloaut.equals(modeloautM3)&& año >= 2008 && año <= 2010 ){ 
                                            System.out.println("Modelo encontrado de mercedes-Benz  Multego OC-500 del año 2008 a 2010 " + balatasautMBv2 + " piezas ");
                                            System.out.println("Cuantas piezas desea comprar ");
                                            nusuario1 = entrada.nextInt();
                                            balatasautMBv2 = balatasautMBv2 - nusuario1 ;   
                                            carr58 = nusuario1;
                                            System.out.println("");
                                            
                                        }else {
                                            System.out.println("Modelo no disponible ");
                                        }
                                    }else if (frenosu3.equals(frenosauv3)) { 
                                        System.out.println("Modelo encontrado International");
                                        System.out.println("Digite su modelo");
                                        modeloaut = entrada.next();
                                        System.out.println("Digite su año ");
                                        año = entrada.nextInt();
                                        if (modeloaut.equals(modeloautIn1) && año >= 2012 && año <= 2015 ){
                                            System.out.println("Modelo encontrado International Dacza 4700 año 2012 a 2015 tenemos " + balatasautInt1 + " piezas ");
                                            System.out.println("Cuantas desea comprar ");
                                            nusuario1 = entrada.nextInt();
                                            balatasautInt1 = balatasautInt1 - nusuario1;
                                            carr59 = nusuario1;
                                            System.out.println("");
                                            
                                        }else if (modeloaut.equals(modeloautIn2) && año >= 2004 && año <= 2007 ){
                                            System.out.println("Modelo encontrado International DT466 Bus americano año 2004 a 2007 tenemos "+balatasautInt2+ " piezas " );
                                            System.out.println("Cuantas desea comprar ");
                                            nusuario1 = entrada.nextInt();
                                            balatasautInt2 = balatasautInt2 - nusuario1;
                                              carr60 = nusuario1;                                          
                                            System.out.println("");
                                        }else if (modeloaut.equals(modeloautIn3) && año >= 2020 && año <= 2022 ){
                                            System.out.println("Modelo encontrado International 4700FE año 2020 a 2022 tenemos "+balatasautInt3 + " Piezas");
                                            System.out.println("Cuantas desea comprar ");
                                            nusuario1 = entrada.nextInt();
                                            balatasautInt3 = balatasautInt3 - nusuario1;
                                            carr61 = nusuario1;
                                            System.out.println("");
                                        }else{
                                            System.out.println("No disponible");
                                        }
                                    }
                                case 2 : 
                                    System.out.println("Piezas de motor de autobus  Selecione su modelo "); 
                                    System.out.println("1.- Volvo ");
                                    System.out.println("2.- Mercedes-Benz");
                                    System.out.println("3.- International ");
                                    opcAUT = entrada.nextInt();
                                    
                                    switch (opcAUT){
                                        case 1 : 
                                            System.out.println("Volvo");
                                            System.out.println("1.- Bomba de aceite se adapta a: RVI C, K, KERAX, MAGNUM, T; VOLVO 9700, 9900,");
                                            System.out.println("2.- Kit de correa de cámara de sincronización + bomba de agua para Volvo XC60 XC90 V70 XC70 S60 S80 V60");
                                            System.out.println("3.- Sensor de velocidad de posición del cigüeñal del motor Dorman 904-77 OE");
                                            opcusuario = entrada.nextInt();
                                            switch (opcusuario){
                                                case 1 :
                                                    System.out.println("Bomba de aceite");
                                                    System.out.println("Cuantas desea comprar");
                                                    nusuario1 = entrada.nextInt();
                                                    bomb1 = bomb1 - nusuario1;
                                                    carr62 = nusuario1;
                                                    break;
                                                case 2 : 
                                                    System.out.println("Kit de correa ");
                                                    System.out.println("Cuantas desea comprar");
                                                    nusuario1 = entrada.nextInt();
                                                    kitcorr1= kitcorr1 - nusuario1;
                                                    carr63 = nusuario1;
                                                    break;
                                                case 3 :
                                                    System.out.println("Sensor de velocidad de posición del cigüeñal");
                                                    System.out.println("Cuantos desea comprar");
                                                    nusuario1 = entrada.nextInt();
                                                    sensefast1 = sensefast1 - nusuario1; 
                                                    carr64 = nusuario1;
                                                    break; 
                                            }
                                            break; 
                                        case 2 : 
                                            System.out.println("Mercedes-Benz");
                                            System.out.println("1.- Bomba de aceite ");
                                            System.out.println("2.- Kit de correa de cámara de sincronización + bomba de agua ");
                                            System.out.println("3.- Sensor de velocidad de posición del cigüeñal del motor Dorman");
                                            opcusuario = entrada.nextInt();
                                            switch (opcusuario){
                                                case 1 :
                                                    System.out.println("Bomba de aceite");
                                                    System.out.println("Cuantas desea comprar");
                                                    nusuario1 = entrada.nextInt();
                                                    bomb2 = bomb2 - nusuario1;
                                                    carr65 = nusuario1;
                                                    break;
                                                case 2 : 
                                                    System.out.println("Kit de correa ");
                                                    System.out.println("Cuantas desea comprar");
                                                    nusuario1 = entrada.nextInt();
                                                    kitcorr2= kitcorr2 - nusuario1;
                                                    carr66 = nusuario1;
                                                    break;
                                                case 3 :
                                                    System.out.println("Sensor de velocidad de posición del cigüeñal");
                                                    System.out.println("Cuantos desea comprar");
                                                    nusuario1 = entrada.nextInt();
                                                    sensefast2 = sensefast2 - nusuario1;
                                                    carr67 = nusuario1;
                                            break;
                                            }
                                        case 3 : 
                                            System.out.println("International ");                                           
                                            System.out.println("1.- Bomba de aceite ");
                                            System.out.println("2.- Kit de correa de cámara de sincronización + bomba de agua ");
                                            System.out.println("3.- Sensor de velocidad de posición del cigüeñal del motor Dorman");
                                            opcusuario = entrada.nextInt();
                                                    switch (opcusuario){
                                                     case 1 :
                                                         System.out.println("Bomba de aceite");
                                                         System.out.println("Cuantas desea comprar");
                                                         nusuario1 = entrada.nextInt();
                                                         bomb3 = bomb3 - nusuario1;
                                                         carr68 = nusuario1;
                                                    break;
                                                          case 2 : 
                                                          System.out.println("Kit de correa ");
                                                          System.out.println("Cuantas desea comprar");
                                                          nusuario1 = entrada.nextInt();
                                                          kitcorr3= kitcorr3 - nusuario1;
                                                          carr69 = nusuario1;
                                                    break;
                                                           case 3 :
                                                           System.out.println("Sensor de velocidad de posición del cigüeñal");
                                                           System.out.println("Cuantos desea comprar");
                                                           nusuario1 = entrada.nextInt();
                                                           sensefast3 = sensefast3 - nusuario1;
                                                           carr70 = nusuario1;
                                                    break;        
                                            }
                                            break;
                                    }
                                    break;
                                case 3:
                                    System.out.println("Piezas de Transmision Selecione la marca  ");
                                    System.out.println("1.- Volvo");
                                    System.out.println("2.- Mercedes-Benz");
                                    System.out.println("3.- International ");
                                    System.out.println("4.- Salir");
                                    opcusuario = entrada.nextInt();
                                    switch(opcusuario){
                                        
                                        case 1 : 
                                            System.out.println("Volvo Seleccione su pieza ");
                                            System.out.println("1.- Road Choice Clu embrague ");
                                            System.out.println("2.- Llave de transmision ");
                                            System.out.println("3.- Tubo de linea de lubricacion ");
                                            System.out.println("4.- salir  ");
                                            opcusuario = entrada.nextInt();
                                             switch (opcusuario){
                                                 case 1 : 
                                                     System.out.println(" Road Choice Clu embrague de  volvo  Cuantos necesita ");
                                                     nusuario1  = entrada.nextInt();
                                                     embraguev1 = embraguev1 - nusuario1 ; 
                                                     carr71 = nusuario1;
                                                     break ; 
                                                 case 2 : 
                                                     System.out.println("Llave de transmision de volov Cuantos necesitas ");
                                                     nusuario1  = entrada.nextInt();
                                                     transmision1 = transmision1 - nusuario1;
                                                     carr72 = nusuario1;
                                                     break; 
                                                 case 3 : 
                                                     System.out.println("Tubo de linea de lubricacion de volvo cuantos necesitas ");
                                                     nusuario1  = entrada.nextInt();
                                                     lubricacion1 = lubricacion1 - nusuario1; 
                                                     carr73 = nusuario1;
                                                     break;
                                             }
                                            break;
                                        case 2 : 
                                            System.out.println("Mercedes-Benz Selecione su pieza ");
                                            System.out.println("1.- Road Choice Clu embrague ");
                                            System.out.println("2.- Llave de transmision ");
                                            System.out.println("3.- Tubo de linea de lubricacion ");
                                            System.out.println("4.- salir  ");
                                            opcusuario = entrada.nextInt();
                                             switch (opcusuario){
                                                 case 1 : 
                                                     System.out.println(" Road Choice Clu embrague de  Mercedes-Benz  Cuantos necesita ");
                                                     nusuario1  = entrada.nextInt();
                                                     embraguev2 = embraguev2 - nusuario1 ; 
                                                     carr74 = nusuario1;
                                                     break ; 
                                                 case 2 : 
                                                     System.out.println("Llave de transmision de Mercedes-Benz Cuantos necesitas ");
                                                     nusuario1  = entrada.nextInt();
                                                     transmision2 = transmision2 - nusuario1;
                                                     carr75 = nusuario1;
                                                     break; 
                                                 case 3 : 
                                                     System.out.println("Tubo de linea de lubricacion de volvo cuantos necesitas");
                                                     nusuario1  = entrada.nextInt();
                                                     lubricacion2 = lubricacion2 - nusuario1;
                                                     carr75 = nusuario1;
                                                     break;
                                                 
                                             }
                                            
                                            break; 
                                        case 3 : 
                                            System.out.println("International");
                                            System.out.println("1.- Road Choice Clu embrague ");
                                            System.out.println("2.- Llave de transmision ");
                                            System.out.println("3.- Tubo de linea de lubricacion ");
                                            System.out.println("4.- salir  ");
                                            opcusuario = entrada.nextInt();
                                            switch (opcusuario){
                                                 case 1 : 
                                                     System.out.println(" Road Choice Clu embrague de International Cuantos necesita ");
                                                     nusuario1  = entrada.nextInt();
                                                     embraguev3 = embraguev3 - nusuario1 ; 
                                                     carr76 = nusuario1;
                                                     break ; 
                                                 case 2 : 
                                                     System.out.println("Llave de transmision de International Cuantos necesitas ");
                                                     nusuario1  = entrada.nextInt();
                                                     transmision3 = transmision3 - nusuario1;
                                                     carr77 = nusuario1;
                                                     break; 
                                                 case 3 : 
                                                     System.out.println("Tubo de linea de lubricacion de International cuantos necesitas");
                                                     nusuario1  = entrada.nextInt();
                                                     lubricacion3 = lubricacion3 - nusuario1;
                                                     carr78 = nusuario1;
                                                     break;
                                        }
                                    }
                            }
                        default:
                        
                    }
                    
                case 2:
                   System.out.println("INVENTARIO y VENTAS ");
                   System.out.println("1.- Carrito de compras ");
                   System.out.println("2.-  Checar inventario");
                   System.out.println("3.- Salir");
                   opcI=entrada.nextInt();
                   switch (opcI){
                        case 1 : 
                           System.out.println("CARRITO DE COMPRAS");
                            totl = carr1 + carr2+ carr3+ carr4+ carr5+ carr6+ carr7+ carr8+ carr9+ carr10+ carr11+ carr12+ carr13+ carr14+ carr15+ carr16+ carr17 + carr18+ carr19+ carr20+carr21+ carr22+ carr23+ carr24+carr25+carr26+carr27+carr28+carr29+carr30+carr31+carr32+carr33+carr34+carr35+
                            carr36+carr37+carr38+carr39+carr40+carr41+carr42+carr43+carr44+carr45+carr46+carr47+carr48+carr49+carr50+carr51+carr52+carr53+carr54+carr58+carr59+carr60+carr61+ carr62+ carr63+ carr64+carr65+carr66+carr67+carr68+carr69+carr70+carr71+carr72+carr73+carr74+carr75; 
                            System.out.println("Tienes en tu carrito de compras "+(totl- totldelte)+" piezas por pagar");
                            System.out.println("1.- Proceder a facturar y enviar");
                            System.out.println("2.- eliminar compras "); 
                            System.out.println("3.- Salir ");
                            opcusuario = entrada.nextInt();
                            tot = totl * 222;
                            switch (opcusuario){
                                case 1 : 
                                    System.out.println("Facturacion y envio");    
                                    System.out.println("Escribe tu nombre");
                                    nombre= entrada.next();
                                    System.out.println("Escribe tu apellido");
                                    apellido = entrada.next();
                                    System.out.println("Escribe tu Estado ");
                                    estado = entrada.next();
                                    System.out.println("Listo pedido registrado");
                                   
                                   break;
                                case 2 : 
                                    System.out.println("Seguro quiere eliminar");
                                    System.out.println("1. Si");
                                    System.out.println("2. no ");
                                    opcusuario = entrada.nextInt();
                                    switch(opcusuario){
                                        case 1:
                                            System.out.println("Eliminado");
                                            totldelte = totl;
                                    //totl = carr1 - carr2- carr3-carr4- carr5- carr6- carr7-carr8- carr9- carr10- carr11- carr12- carr13- carr14- carr15-carr16- carr17 - carr18- carr19- carr20-carr21- carr22- carr23- carr24-carr25-carr26-carr27-carr28-carr29-carr30-carr31-carr32-carr33-carr34-carr35-
                          //  carr36-carr37-carr38-carr39-carr40-carr41-carr42-carr43-carr44-carr45-carr46-carr47-carr48-carr49-carr50-carr51-carr52-carr53-carr54-carr58-carr59-carr60-carr61- carr62- carr63- carr64-carr65-carr66-carr67-carr68-carr69-carr70-carr71-carr72-carr73-carr74-carr75;
                                    break;
                                    }
                                break;    
                            }
                           break;
                        case 2 :
                            System.out.println("INVENTARIO"); 
                            System.out.println("Selecciona el modelo");
                            System.out.println("1.- volvo");
                            System.out.println("2.- Mercedes-Benz");
                            System.out.println("3.- international");
                            System.out.println("4.- John Deere");
                            System.out.println("5.- New Holland");
                            System.out.println("6.- Kubota");
                            System.out.println("EXIT");
                            opcusuario = entrada.nextInt();
                            switch (opcusuario){
                                case 1:
                                    System.out.println("VOLVO");
                                    System.out.println("tienes "+ balatasvolvo2+" Balatas");
                                    System.out.println("Tienes "+balatasvolvo + " Balatas ");
                                    System.out.println("Tienes "+bomba1+ " Bomba volvo" );
                                    System.out.println("Tienes "+ interr+ " piezas interr");
                                    System.out.println("1.-  Añadir             ");
                                    System.out.println("2-  Salir");
                                    opcusuario = entrada.nextInt();
                                    switch ( opcusuario){
                                        case 1 :
                                            System.out.println("Añadir");
                                            System.out.println("Cuantas piezas desa pedir al provedor");
                                            nusuario1= entrada.nextInt();
                                            break;
                                    }
                                    break;
                                case 2 : 
                                    System.out.println("Mercedes-Benz");
                                    System.out.println("Tienes "+balatasmb + " balatas " );
                                    System.out.println("Tienes "+bombacomb+ "bombas ");
                                    System.out.println("Tienes "+interr2+ " Iterruptores ");
                                    System.out.println("1.- Añadir mas ");
                                    System.out.println("2.- Salir");
                                    opcusuario = entrada.nextInt();
                                    switch ( opcusuario){
                                        case 1 :
                                            System.out.println("Añadir");
                                            System.out.println("Cuantas piezas desa pedir al provedor");
                                            nusuario1= entrada.nextInt();
                                            break;
                                        
                                    }
                                    break;
                                case 3 :
                                    System.out.println("international");
                                    System.out.println("Tines "+ bandafren+ " Bada de frenos");
                                    System.out.println("Tienes "+embraguev3+ "Embragues " );
                                    System.out.println("tienes "+ balatasint3+ " Balaztas");
                                    System.out.println("1.- Añadir mas ");
                                    System.out.println("2.- Salir");
                                    opcusuario = entrada.nextInt();
                                    switch ( opcusuario){
                                        case 1 :
                                            System.out.println("Añadir");
                                            System.out.println("Cuantas piezas desa pedir al provedor");
                                            nusuario1= entrada.nextInt();
                                            break; 
                                        
                                    }
                                    break; 
                                case 4 : 
                                    System.out.println("John Deere");
                                    System.out.println("Tienes "+ placas1+ " Placas  de transmision");
                                    System.out.println("Tienes "+ embrague1+ " Embragues ");
                                    System.out.println("Tienes "+transm1y2v1+ " piezas de trnasmicion " );
                                    System.out.println("1.- Añadir mas ");
                                    System.out.println("2.- Salir");
                                    opcusuario = entrada.nextInt();
                                    switch ( opcusuario){
                                        case 1 :
                                            System.out.println("Añadir");
                                            System.out.println("Cuantas piezas desa pedir al provedor");
                                            nusuario1= entrada.nextInt();
                                            break; 
                                        
                                    }
                                    break; 
                                case 5 : 
                                    System.out.println("New Holland");
                                    System.out.println("Tienes "+placas2+ " Placas de transmision " );
                                    System.out.println("Tienes"+ transm1y2v2+ " Treanmisiones " );
                                    System.out.println("1.- Añadir mas ");
                                    System.out.println("2.- Salir");
                                    opcusuario = entrada.nextInt();
                                    switch ( opcusuario){
                                        case 1 :
                                            System.out.println("Añadir");
                                            System.out.println("Cuantas piezas desa pedir al provedor");
                                            nusuario1= entrada.nextInt();
                                            break;
                                        
                                    }
                                    break ;
                                case 6 :
                                    System.out.println("Kubota");
                                    System.out.println("Tienes "+ placas3+ " Placas de transmision ");
                                    System.out.println("Tienes "+ embrague3+ " Embragues ");
                                    System.out.println("Tienes "+ transm1y2v3+ " Transmisiones ");
                                    System.out.println("");
                                    System.out.println("1.- Añadir mas ");
                                    System.out.println("2.- Salir");
                                    opcusuario = entrada.nextInt();
                                    switch ( opcusuario){
                                        case 1 :
                                            System.out.println("Añadir");
                                            System.out.println("Cuantas piezas desa pedir al provedor");
                                            nusuario1= entrada.nextInt();
                                        break;
                                    }
                                    break; 
                            }
                            break;
                                      
                   }
                   break;
                   
                  
                case 3:
                   System.out.println("Envio a clientes");
                   System.out.println("1.  Envios");
                    System.out.println("2.- Pedidos a ditribuidor ");
                   System.out.println("3.-  Salir");
                   opcHV=entrada.nextInt();
                   switch (opcHV){
                       case 1 : 
                           System.out.println("ENVIOS");
                           System.out.println("Cliente 1: "+nombre+" "+ apellido+ " es de "+ estado+ " Compro " +totl+ " Piezas y debe "+ tot + " pesos");
                           System.out.println("");
                           opcHV=entrada.nextInt();
                            break;   
                       case 2 : 
                           System.out.println("Pedidos a distribuidor");
                           break; 
                       
                   }
                   
                    break;
            }
    
        }else{
                System.out.println("Usuario no encontrado");
                }
    }
            System.out.println("Erro404");
        
        
    }
}

    
    
    
    

