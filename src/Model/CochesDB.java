package Model;

import Model.Coche;
import Model.Marca;
import Model.Tipo;
import Model.Traccion;

import java.io.*;
import java.util.*;

/**
 * Created by Neo on 20/05/2017.
 */

/**
 * Clase metodo con un scanner, dos arrays creados ,uno de listadecoches y el otro para guardar los coches favoritos
 */
public class CochesDB {
    Scanner entrada = new Scanner(System.in);

    ArrayList<Coche> listadecoches = new ArrayList<Coche>();
    ArrayList<Coche> listadecochesfavoritos = new ArrayList<Coche>();

    Coche Abarth500 = new Coche("Abarth 500", Tipo.COUPE, 140, 4, 206, 205, 8.1, true, Traccion.DELANTERA, Marca.ABARTH, 2009, 20700);
    Coche AbarthGrandePunto = new Coche("Abarth Grande Punto", Tipo.COUPE, 155, 4, 206, 208, 8.2, true, Traccion.DELANTERA, Marca.ABARTH, 2009, 17200);
    Coche AbarthPuntoEvo = new Coche("Abarth Punto Evo", Tipo.COUPE, 180, 4, 270, 216, 7.5, true, Traccion.DELANTERA, Marca.ABARTH, 2010, 18690);
    Coche AbarthPunto = new Coche("Abarth Punto", Tipo.COUPE, 180, 4, 270, 216, 7.5, true, Traccion.DELANTERA, Marca.ABARTH, 2012, 20600);
    Coche Abarth695 = new Coche("Abarth 695", Tipo.COUPE, 190, 4, 250, 230, 5.9, true, Traccion.DELANTERA, Marca.ABARTH, 2014, 40900);
    Coche Abarth595 = new Coche("Abarth 595", Tipo.COUPE, 180, 4, 250, 230, 5.0, true, Traccion.DELANTERA, Marca.ABARTH, 2017, 28550);
    Coche Abarth124Spider = new Coche("Abarth 124 Spider", Tipo.COUPE, 170, 4, 250, 232, 6.8, true, Traccion.DELANTERA, Marca.ABARTH, 2017, 40000);

    Coche AlfaRomeoGTV = new Coche("Alfa Romeo GTV", Tipo.COUPE, 150, 4, 181, 215, 8.7, true, Traccion.DELANTERA, Marca.ALFAROMEO, 2003, 26107);
    Coche AlfaRomeo156 = new Coche("Alfa Romeo 156", Tipo.SEDAN, 115, 5, 120, 191, 10.3, false, Traccion.DELANTERA, Marca.ALFAROMEO, 2004, 26574);
    Coche AlfaRomeo166 = new Coche("Alfa Romeo 166", Tipo.SEDAN, 150, 4, 230, 210, 9.9, false, Traccion.DELANTERA, Marca.ALFAROMEO, 2004, 39261);
    Coche AlfaRomeoGT = new Coche("Alfa Romeo GT", Tipo.COUPE, 150, 4, 305, 209, 9.6, true, Traccion.DELANTERA, Marca.ALFAROMEO, 2004, 32100);
    Coche AlfaRomeo147 = new Coche("Alfa Romeo 147", Tipo.COUPE, 150, 4, 181, 208, 9.3, true, Traccion.DELANTERA, Marca.ALFAROMEO, 2005, 22450);
    Coche AlfaRomeo159 = new Coche("Alfa Romeo 159", Tipo.SEDAN, 170, 4, 360, 216, 9.0, true, Traccion.DELANTERA, Marca.ALFAROMEO, 2006, 31710);
    Coche AlfaRomeoBrera = new Coche("Alfa Romeo Brera", Tipo.COUPE, 210, 4, 400, 231, 7.9, true, Traccion.DELANTERA, Marca.ALFAROMEO, 2006, 37853);
    Coche AlfaRomeoSpider = new Coche("Alfa Romeo Spider", Tipo.COUPE, 200, 4, 185, 228, 8.4, false, Traccion.DELANTERA, Marca.ALFAROMEO, 2006, 41400);
    Coche AlfaRomeoMito = new Coche("Alfa Romeo Mito", Tipo.COUPE, 78, 4, 115, 160, 14.0, false, Traccion.DELANTERA, Marca.ALFAROMEO, 2013, 9210);
    Coche AlfaRomeoGiulietta = new Coche("Alfa Romeo Giulietta", Tipo.COUPE, 170, 4, 250, 218, 7.7, true, Traccion.DELANTERA, Marca.ALFAROMEO, 2014, 31150);
    Coche AlfaRomeoStelvio = new Coche("Alfa Romeo Stelvio", Tipo.TODOTERRENO, 210, 4, 470, 215, 6.6, true, Traccion.TODAS, Marca.ALFAROMEO, 2017, 48300);
    Coche AlfaRomeoGiulia = new Coche("Alfa Romeo Giulia", Tipo.DEPORTIVO, 510, 6, 600, 307, 3.9, true, Traccion.TRASERA, Marca.ALFAROMEO, 2017, 78806);
    Coche AlfaRomeo4C = new Coche("Alfa Romeo 4C", Tipo.DEPORTIVO, 240, 4, 350, 258, 4.5, true, Traccion.TRASERA, Marca.ALFAROMEO, 2017, 66200);

    Coche AstonMartinVanquish = new Coche("Aston Martin Vanquish", Tipo.DEPORTIVO, 528, 12, 577, 321, 4.8, true, Traccion.TRASERA, Marca.ASTONMARTIN, 2002, 293044);
    Coche AstonMartinDB9 = new Coche("Aston Martin DB9", Tipo.DEPORTIVO, 456, 4, 600, 306, 4.6, true, Traccion.TRASERA, Marca.ASTONMARTIN, 2004, 172062);
    Coche AstonMartinVantage = new Coche("Aston Martin Vantage", Tipo.DEPORTIVO, 426, 8, 470, 290, 4.9, true, Traccion.TRASERA, Marca.ASTONMARTIN, 2005, 132314);
    Coche AstonMartinDBS = new Coche("Aston Martin DBS", Tipo.DEPORTIVO, 517, 12, 570, 307, 4.3, true, Traccion.TRASERA, Marca.ASTONMARTIN, 2008, 292142);
    Coche AstonMartinRapide = new Coche("Aston Martin Rapide", Tipo.DEPORTIVO, 476, 12, 600, 295, 5.2, true, Traccion.TRASERA, Marca.ASTONMARTIN, 2010, 228781);
    Coche AstonMartinCygnet = new Coche("Aston Martin Cygnet", Tipo.COUPE, 98, 4, 123, 170, 11.6, true, Traccion.DELANTERA, Marca.ASTONMARTIN, 2011, 42434);
    Coche AstonMartinVirage = new Coche("Aston Martin Virage", Tipo.DEPORTIVO, 497, 12, 570, 301, 4.8, true, Traccion.TRASERA, Marca.ASTONMARTIN, 2011, 223245);

    Coche AudiA2 = new Coche("Audi A2", Tipo.SEDAN, 61, 3, 140, 168, 14.9, false, Traccion.DELANTERA, Marca.AUDI, 2000, 20450);
    Coche AudiCabrio = new Coche("Audi Cabrio", Tipo.COUPE, 140, 4, 320, 212, 9.7, false, Traccion.DELANTERA, Marca.AUDI, 2006, 38780);
    Coche AudiTT = new Coche("Audi TT", Tipo.DEPORTIVO, 230, 4, 370, 250, 6.1, true, Traccion.DELANTERA, Marca.AUDI, 2014, 42190);
    Coche AudiA7 = new Coche("Audi A7", Tipo.SEDAN, 218, 6, 400, 241, 7.3, true, Traccion.DELANTERA, Marca.AUDI, 2014, 63860);
    Coche AudiA8 = new Coche("Audi A8", Tipo.SEDAN, 262, 6, 580, 250, 5.9, true, Traccion.TODAS, Marca.AUDI, 2014, 87730);
    Coche AudiR8 = new Coche("Audi R8", Tipo.DEPORTIVO, 540, 10, 540, 320, 3.5, true, Traccion.TODAS, Marca.AUDI, 2015, 194770);
    Coche AudiA1 = new Coche("Audi A1", Tipo.COUPE, 90, 3, 230, 182, 11.4, true, Traccion.DELANTERA, Marca.AUDI, 2015, 21800);
    Coche AudiA6 = new Coche("Audi A6", Tipo.SEDAN, 150, 4, 350, 214, 9.5, true, Traccion.DELANTERA, Marca.AUDI, 2015, 41970);
    Coche AudiQ3 = new Coche("Audi Q3", Tipo.TODOTERRENO, 150, 4, 250, 204, 9.2, true, Traccion.DELANTERA, Marca.AUDI, 2015, 27309);
    Coche AudiQ7 = new Coche("Audi Q7", Tipo.TODOTERRENO, 218, 6, 500, 216, 7.1, true, Traccion.TODAS, Marca.AUDI, 2015, 62590);
    Coche AudiA3 = new Coche("Audi A3", Tipo.COUPE, 150, 4, 340, 218, 8.5, true, Traccion.DELANTERA, Marca.AUDI, 2016, 22851);
    Coche AudiA4 = new Coche("Audi A4", Tipo.SEDAN, 122, 4, 270, 205, 10.5, true, Traccion.DELANTERA, Marca.AUDI, 2016, 33970);
    Coche AudiA5 = new Coche("Audi A5", Tipo.SEDAN, 190, 4, 320, 240, 7.2, true, Traccion.DELANTERA, Marca.AUDI, 2016, 41400);
    Coche AudiQ2 = new Coche("Audi Q2", Tipo.TODOTERRENO, 115, 3, 200, 197, 10.1, true, Traccion.DELANTERA, Marca.AUDI, 2016, 27000);
    Coche AudiQ5 = new Coche("Audi Q5", Tipo.TODOTERRENO, 150, 4, 320, 206, 9.7, true, Traccion.DELANTERA, Marca.AUDI, 2017, 35931);

    Coche BentleyArnage = new Coche("Bentley Arnage", Tipo.SEDAN, 405, 8, 825, 250, 6.3, false, Traccion.TRASERA, Marca.BENTLEY, 1998, 247314);
    Coche BentleyContinentalGT = new Coche("Bentley Continental GT", Tipo.COUPE, 560, 12, 650, 318, 4.8, true, Traccion.TODAS, Marca.BENTLEY, 2003, 193828);
    Coche BentleyContinentalGTC = new Coche("Bentley Continental GTC", Tipo.SEDAN, 560, 12, 650, 312, 5.1, true, Traccion.TODAS, Marca.BENTLEY, 2006, 213215);
    Coche BentleyAzure = new Coche("Bentley Continental Azure", Tipo.COUPE, 560, 12, 650, 300, 4.7, false, Traccion.TRASERA, Marca.BENTLEY, 2007, 361233);
    Coche BentleyBrooklands = new Coche("Bentley Brooklands", Tipo.COUPE, 537, 12, 600, 296, 5.3, true, Traccion.TRASERA, Marca.BENTLEY, 2008, 379175);
    Coche BentleyContinentalFlying = new Coche("Bantley Continental Flying Spur", Tipo.SEDAN, 560, 12, 650, 312, 5.2, true, Traccion.TRASERA, Marca.BENTLEY, 2008, 195733);
    Coche BentleyMulsanne = new Coche("Bentley Mulsane", Tipo.SEDAN, 512, 12, 1020, 296, 5.3, true, Traccion.TRASERA, Marca.BENTLEY, 2010, 367272);
    Coche BentleyBentayga = new Coche("Benley Bentayga", Tipo.TODOTERRENO, 435, 8, 900, 270, 4.8, true, Traccion.TODAS, Marca.BENTLEY, 2016, 198874);

    Coche BmwZ4 = new Coche("Bmw Z4", Tipo.COUPE, 156, 4, 270, 221, 7.9, true, Traccion.TRASERA, Marca.BMW, 2009, 38900);
    Coche BmwSerie3 = new Coche("Bmw Serie 3", Tipo.SEDAN, 431, 6, 550, 250, 4.3, true, Traccion.TRASERA, Marca.BMW, 2012, 89950);
    Coche BmwSerie4 = new Coche("Bmw Serie 4", Tipo.COUPE, 150, 4, 320, 215, 8.6, true, Traccion.TRASERA, Marca.BMW, 2013, 41300);
    Coche BmwSerie5GranTurismo = new Coche("Bmw Serie 5 Gran Turismo", Tipo.SEDAN, 184, 4, 380, 215, 8.9, true, Traccion.TRASERA, Marca.BMW, 2013, 54950);
    Coche BmwX5 = new Coche("Bmw X5", Tipo.TODOTERRENO, 231, 4, 500, 220, 7.7, true, Traccion.TRASERA, Marca.BMW, 2013, 59250);
    Coche Bmwi8 = new Coche("Bmw I8", Tipo.DEPORTIVO, 362, 3, 320, 250, 4.4, true, Traccion.TODAS, Marca.BMW, 2014, 139000);
    Coche Bmwi3 = new Coche("Bmw I3", Tipo.COUPE, 34, 2, 50, 250, 7.9, false, Traccion.TRASERA, Marca.BMW, 2014, 39990);
    Coche BmwSerie2 = new Coche("Bmw Serie 2", Tipo.COUPE, 136, 3, 220, 210, 8.8, true, Traccion.TRASERA, Marca.BMW, 2014, 29500);
    Coche BmwSerie2ActiveTourer = new Coche("Bmw Serie 2 Active Tourer", Tipo.TODOTERRENO, 116, 3, 270, 195, 10.6, true, Traccion.DELANTERA, Marca.BMW, 2014, 28650);
    Coche BmwX3 = new Coche("Bmw X3", Tipo.TODOTERRENO, 150, 4, 360, 195, 9.5, true, Traccion.TRASERA, Marca.BMW, 2014, 40450);
    Coche BmwX4 = new Coche("Bmw X4", Tipo.TODOTERRENO, 184, 4, 270, 212, 9.1, true, Traccion.TODAS, Marca.BMW, 2014, 49550);
    Coche BmwSerie1 = new Coche("Bmw Serie 1", Tipo.SEDAN, 109, 3, 180, 195, 10.9, true, Traccion.DELANTERA, Marca.BMW, 2015, 26450);
    Coche BmwSerie2GranTourer = new Coche("Bmw Serie 2 Gran Tourer", Tipo.TODOTERRENO, 116, 3, 270, 192, 11.1, true, Traccion.DELANTERA, Marca.BMW, 2015, 30150);
    Coche BmwSerie6 = new Coche("Bmw Serie 6", Tipo.DEPORTIVO, 313, 6, 650, 250, 5.3, true, Traccion.TRASERA, Marca.BMW, 2015, 100.800);
    Coche BmwSerie7 = new Coche("Bmw Serie 7", Tipo.SEDAN, 265, 6, 620, 250, 6.1, true, Traccion.TRASERA, Marca.BMW, 2015, 94650);
    Coche BmwX1 = new Coche("Bmw X1", Tipo.TODOTERRENO, 116, 3, 270, 190, 11.1, true, Traccion.DELANTERA, Marca.BMW, 2015, 30950);
    Coche BmwX6 = new Coche("Bmw X6", Tipo.TODOTERRENO, 258, 6, 560, 230, 6.7, true, Traccion.TODAS, Marca.BMW, 2015, 79950);
    Coche BmwSerie3GranTurismo = new Coche("Bmw Serie 3 Gran Turismo", Tipo.SEDAN, 150, 4, 320, 210, 9.3, true, Traccion.TRASERA, Marca.BMW, 2016, 39900);
    Coche BmwSerie5 = new Coche("Bmw Serie 5", Tipo.SEDAN, 190, 4, 400, 238, 7.7, true, Traccion.TRASERA, Marca.BMW, 2017, 49400);

    Coche BugattiVeyron = new Coche("Bugatti Veyron", Tipo.DEPORTIVO, 1001, 16, 1200, 407, 2.5, true, Traccion.TODAS, Marca.BUGATTI, 2004, 5000000);
    Coche BugattiVeyronSuperSport = new Coche("Bugatti Veyron SuperSport", Tipo.DEPORTIVO, 1200, 16, 1500, 415, 2.5, true, Traccion.TODAS, Marca.BUGATTI, 2011, 7500000);

    Coche CadillacXLR = new Coche("Cadillac XLR", Tipo.COUPE, 325, 8, 450, 250, 5.9, true, Traccion.TRASERA, Marca.CADILLAC, 2004, 92175);
    Coche CadillacSTS = new Coche("Cadillac STS", Tipo.SEDAN, 257, 6, 342, 229, 7.4, true, Traccion.TRASERA, Marca.CADILLAC, 2005, 49175);
    Coche CadillacBls = new Coche("Cadillac Bls", Tipo.TODOTERRENO, 150, 4, 320, 200, 10.4, true, Traccion.DELANTERA, Marca.CADILLAC, 2006, 33290);
    Coche CadillacEscalade = new Coche("Cadillac Escalade", Tipo.TODOTERRENO, 409, 8, 565, 170, 6.8, true, Traccion.TODAS, Marca.CADILLAC, 2007, 75090);
    Coche CadillacSRX = new Coche("Cadillac SRX", Tipo.TODOTERRENO, 268, 6, 302, 210, 8.4, false, Traccion.TODAS, Marca.CADILLAC, 2011, 59068);
    Coche CadillacATS = new Coche("Cadillac ATS", Tipo.SEDAN, 272, 4, 400, 240, 5.9, true, Traccion.TRASERA, Marca.CADILLAC, 2013, 41200);
    Coche CadillacCTS = new Coche("Cadillac CTS", Tipo.SEDAN, 272, 4, 400, 240, 6.6, true, Traccion.TRASERA, Marca.CADILLAC, 2014, 48894);
    Coche CadillacATSCoupe = new Coche("Cadillac ATS Coupe", Tipo.COUPE, 272, 4, 400, 240, 6.2, true, Traccion.TRASERA, Marca.CADILLAC, 2015, 44500);

    Coche ChevroletTrailBlazer = new Coche("Chevrolet TrailBlazer", Tipo.TODOTERRENO, 273, 6, 373, 190, 9.0, false, Traccion.TODAS, Marca.CHEVROLET, 2001, 35720);
    Coche ChevroletTahoe = new Coche("Chevrolet Tahoe", Tipo.TODOTERRENO, 285, 8, 427, 170, 11.1, false, Traccion.TODAS, Marca.CHEVROLET, 2001, 49000);
    Coche ChevroletTrans = new Coche("Chevrolet Trans", Tipo.TODOTERRENO, 186, 6, 282, 187, 11.2, false, Traccion.TODAS, Marca.CHEVROLET, 2001, 37948);
    Coche ChevroletTacuma = new Coche("Chevrolet Tacuma", Tipo.TODOTERRENO, 105, 4, 142, 167, 11.8, false, Traccion.DELANTERA, Marca.CHEVROLET, 2005, 12425);
    Coche ChevroletEvanda = new Coche("Chevrolet Evada", Tipo.SEDAN, 131, 4, 181, 200, 10.2, false, Traccion.DELANTERA, Marca.CHEVROLET, 2005, 22000);
    Coche ChevroletNubira = new Coche("Chevrolet Nubira", Tipo.SEDAN, 109, 4, 150, 187, 10.7, false, Traccion.DELANTERA, Marca.CHEVROLET, 2005, 13725);
    Coche ChevroletLacetti = new Coche("Chevrolet Lacetti", Tipo.SEDAN, 95, 4, 131, 175, 11.6, false, Traccion.DELANTERA, Marca.CHEVROLET, 2005, 8950);
    Coche ChevroletKalos = new Coche("Chevrolet Kalos", Tipo.SEDAN, 72, 4, 104, 157, 13.7, false, Traccion.DELANTERA, Marca.CHEVROLET, 2005, 8165);
    Coche ChevroletEpica = new Coche("Chevrolet Epica", Tipo.SEDAN, 143, 6, 195, 207, 9.9, true, Traccion.DELANTERA, Marca.CHEVROLET, 2006, 23925);
    Coche ChevroletMatiz = new Coche("Chevrolet Matiz", Tipo.SEDAN, 51, 3, 71, 145, 18.2, false, Traccion.DELANTERA, Marca.CHEVROLET, 2007, 7395);
    Coche ChevroletHRR = new Coche("Chevrolet HRR", Tipo.TODOTERRENO, 170, 4, 222, 180, 9.1, false, Traccion.DELANTERA, Marca.CHEVROLET, 2008, 19285);
    Coche ChevroletSpark = new Coche("Chevrolet Spark", Tipo.SEDAN, 68, 4, 93, 154, 15.5, false, Traccion.DELANTERA, Marca.CHEVROLET, 2010, 7700);
    Coche ChevroletAveo = new Coche("Chevrolet Aveo", Tipo.COUPE, 75, 4, 190, 163, 14.2, true, Traccion.DELANTERA, Marca.CHEVROLET, 2011, 11450);
    Coche ChevroletOrlando = new Coche("Chevrolet Orlando", Tipo.TODOTERRENO, 130, 4, 315, 180, 10.3, false, Traccion.DELANTERA, Marca.CHEVROLET, 2011, 17460);
    Coche ChevroletCaptiva = new Coche("Chevrolet Captiva", Tipo.TODOTERRENO, 163, 4, 350, 188, 9.9, true, Traccion.TODAS, Marca.CHEVROLET, 2011, 25160);
    Coche ChevroletMalibu = new Coche("Chevrolet MALIBU", Tipo.SEDAN, 160, 4, 350, 206, 9.7, true, Traccion.DELANTERA, Marca.CHEVROLET, 2012, 25800);
    Coche ChevroletVolt = new Coche("Chevrolet Volt", Tipo.TODOTERRENO, 86, 4, 130, 160, 9.0, false, Traccion.DELANTERA, Marca.CHEVROLET, 2012, 39425);
    Coche ChevroletTrax = new Coche("Chevrolet Trax", Tipo.TODOTERRENO, 115, 4, 155, 173, 12.8, false, Traccion.DELANTERA, Marca.CHEVROLET, 2013, 16600);
    Coche ChevroletCorvette = new Coche("Chevrolet Corvette", Tipo.DEPORTIVO, 466, 8, 630, 295, 4.0, true, Traccion.TRASERA, Marca.CHEVROLET, 2013, 79995);
    Coche ChevroletCruze = new Coche("Chevrolet Cruze", Tipo.SEDAN, 117, 4, 155, 195, 12.8, true, Traccion.DELANTERA, Marca.CHEVROLET, 2014, 14102);
    Coche ChevroletCamaro = new Coche("Chevrolet Camaro", Tipo.DEPORTIVO, 432, 8, 569, 250, 5.2, true, Traccion.TRASERA, Marca.CHEVROLET, 2014, 45900);

    Coche ChryslerPtCruiserClassic = new Coche("Chrysler Pt Cruiser Classic", Tipo.SEDAN, 116, 4, 157, 176, 13.5, false, Traccion.DELANTERA, Marca.CHRYSLER, 2000, 17990);
    Coche ChryslerVoyager = new Coche("Chrysler Voyager", Tipo.TODOTERRENO, 143, 4, 340, 185, 9.9, true, Traccion.DELANTERA, Marca.CHRYSLER, 2004, 29500);
    Coche ChryslerCrossfire = new Coche("Chrysler Crossfire", Tipo.COUPE, 218, 6, 310, 242, 6.5, true, Traccion.TRASERA, Marca.CHRYSLER, 2004, 30500);
    Coche ChryslerSebring = new Coche("Chrysler Sebring", Tipo.SEDAN, 140, 4, 200, 212, 8.3, true, Traccion.DELANTERA, Marca.CHRYSLER, 2007, 25100);
    Coche ChryslerCRD = new Coche("Chrysler CRD", Tipo.SEDAN, 218, 6, 510, 263, 5.9, true, Traccion.TRASERA, Marca.CHRYSLER, 2008, 47127);

    Coche CitroenXsara = new Coche("Citroen Xsara", Tipo.SEDAN, 110, 4, 130, 180, 10.1, true, Traccion.DELANTERA, Marca.CITROEN, 1998, 12000);
    Coche CitroenXsaraVTS = new Coche("Citroen Xsara VTS", Tipo.COUPE, 167, 4, 200, 215, 8.0, true, Traccion.DELANTERA, Marca.CITROEN, 1998, 15000);
    Coche CitroenXsaraPicasso = new Coche("Citroen Xsara Picasso", Tipo.SEDAN, 92, 4, 215, 175, 12.1, true, Traccion.DELANTERA, Marca.CITROEN, 2000, 15837);
    Coche CitroenC2 = new Coche("Citroen C2", Tipo.COUPE, 61, 4, 94, 158, 14.4, false, Traccion.DELANTERA, Marca.CITROEN, 2002, 8380);
    Coche CitroenC8 = new Coche("Citroen C8", Tipo.SEDAN, 109, 4, 275, 174, 13.4, false, Traccion.DELANTERA, Marca.CITROEN, 2003, 27390);
    Coche CitroenC3 = new Coche("Citroen C3", Tipo.SEDAN, 68, 4, 120, 158, 16.1, false, Traccion.DELANTERA, Marca.CITROEN, 2003, 15740);
    Coche CitroenC6 = new Coche("Citroen C6", Tipo.SEDAN, 170, 4, 370, 217, 9.6, false, Traccion.DELANTERA, Marca.CITROEN, 2006, 38663);
    Coche CitroenJumper = new Coche("Citroen Jumper", Tipo.FURGONETA, 110, 4, 250, 140, 15.8, true, Traccion.DELANTERA, Marca.CITROEN, 2006, 32630);
    Coche CitroenCCrosser = new Coche("Citroen C-Crosser", Tipo.FURGONETA, 160, 4, 380, 198, 11.1, true, Traccion.DELANTERA, Marca.CITROEN, 2007, 28066);
    Coche CitroenJumpyMultispace = new Coche("Citroen Jumpy Multispace", Tipo.FURGONETA, 125, 4, 158, 170, 13.1, true, Traccion.DELANTERA, Marca.CITROEN, 2007, 31756);
    Coche CitroenGranC4Picasso = new Coche("Citroen Gran C4 Picasso", Tipo.SEDAN, 138, 4, 270, 195, 12.1, true, Traccion.DELANTERA, Marca.CITROEN, 2007, 18940);
    Coche CitroenC4Picasso = new Coche("Citroen C4 Picasso", Tipo.SEDAN, 109, 4, 240, 180, 12.5, true, Traccion.DELANTERA, Marca.CITROEN, 2007, 18674);
    Coche CitroenBerlingo = new Coche("Citroen Berlingo", Tipo.FURGONETA, 75, 4, 185, 153, 17.1, true, Traccion.DELANTERA, Marca.CITROEN, 2008, 18974);
    Coche CitroenC5 = new Coche("Citroen C5", Tipo.SEDAN, 110, 4, 260, 191, 12.2, true, Traccion.DELANTERA, Marca.CITROEN, 2008, 21190);
    Coche CitroenNemo = new Coche("Citroen Nemo", Tipo.FURGONETA, 80, 4, 200, 161, 14.8, true, Traccion.DELANTERA, Marca.CITROEN, 2008, 17065);
    Coche CitroenC1 = new Coche("Citroen C1", Tipo.SEDAN, 55, 4, 130, 154, 15.6, true, Traccion.DELANTERA, Marca.CITROEN, 2009, 9380);
    Coche CitroenC4Aircross = new Coche("Citroen C4 Aircross", Tipo.TODOTERRENO, 115, 4, 280, 182, 10.8, true, Traccion.DELANTERA, Marca.CITROEN, 2012, 22000);
    Coche CitroenC4Cactus = new Coche("Citroen C4 Cactus", Tipo.TODOTERRENO, 82, 3, 118, 169, 12.9, true, Traccion.DELANTERA, Marca.CITROEN, 2014, 16350);
    Coche CitroenEMehari = new Coche("Citroen E-Mehari", Tipo.TODOTERRENO, 68, 3, 95, 110, 10.8, false, Traccion.DELANTERA, Marca.CITROEN, 2016, 26000);
    Coche CitroenCZero = new Coche("Citroen C-Zero", Tipo.SEDAN, 67, 2, 110, 130, 15.9, false, Traccion.TRASERA, Marca.CITROEN, 2017, 23190);
    Coche CitroenC4 = new Coche("Citroen C4", Tipo.SEDAN, 100, 4, 254, 180, 11.5, true, Traccion.DELANTERA, Marca.CITROEN, 2017, 16950);
    Coche CitroenCElysee = new Coche("Citroen C-Elysee", Tipo.SEDAN, 82, 3, 117, 169, 12.9, true, Traccion.DELANTERA, Marca.CITROEN, 2017, 11100);

    Coche CorvetteC6 = new Coche("Corvette C6", Tipo.DEPORTIVO, 404, 8, 546, 300, 4.8, true, Traccion.TRASERA, Marca.CORVETTE, 2005, 67950);
    Coche CorvetteZ06 = new Coche("Corvette Z06", Tipo.DEPORTIVO, 512, 8, 637, 320, 4.2, true, Traccion.TRASERA, Marca.CORVETTE, 2008, 103350);
    Coche CorvetteZR1 = new Coche("Corvette ZR1", Tipo.DEPORTIVO, 647, 8, 807, 330, 3.8, true, Traccion.TRASERA, Marca.CORVETTE, 2009, 149990);

    Coche DaciaSandero = new Coche("Dacia Sandero", Tipo.SEDAN, 68, 4, 160, 157, 15.0, true, Traccion.DELANTERA, Marca.DACIA, 2008, 9750);
    Coche DaciaDuster = new Coche("Dacia Duster", Tipo.TODOTERRENO, 85, 4, 200, 155, 13.9, true, Traccion.DELANTERA, Marca.DACIA, 2010, 14000);
    Coche DaciaLodgy = new Coche("Dacia Lodgy", Tipo.FURGONETA, 90, 4, 200, 169, 12.3, true, Traccion.DELANTERA, Marca.DACIA, 2012, 13330);
    Coche DaciaDokker = new Coche("Dacia Dokker", Tipo.FURGONETA, 75, 4, 180, 152, 15.5, true, Traccion.DELANTERA, Marca.DACIA, 2013, 11718);
    Coche DaciaLogan = new Coche("Dacia Logan", Tipo.SEDAN, 75, 4, 107, 156, 14.5, true, Traccion.DELANTERA, Marca.DACIA, 2012, 9950);

    Coche DodgeChargerHemi = new Coche("Dodge Charger Hemi", Tipo.COUPE, 425, 8, 664, 219, 5.5, true, Traccion.TRASERA, Marca.DODGE, 1966, 7000);
    Coche DodgeViperSRT10 = new Coche("Dodge Viper SRT 10", Tipo.DEPORTIVO, 506, 10, 750, 306, 3.9, true, Traccion.TRASERA, Marca.DODGE, 2003, 123293);
    Coche DodgeCaliber = new Coche("Dodge Caliber", Tipo.TODOTERRENO, 140, 4, 310, 196, 9.3, true, Traccion.DELANTERA, Marca.DODGE, 2006, 17990);
    Coche DodgeNitro = new Coche("Dodge Nitro", Tipo.TODOTERRENO, 117, 4, 200, 180, 11.5, true, Traccion.TRASERA, Marca.DODGE, 2007, 26990);
    Coche DodgeAvenger = new Coche("Dodge Avenger", Tipo.SEDAN, 140, 4, 310, 200, 10.5, true, Traccion.DELANTERA, Marca.DODGE, 2007, 24926);
    Coche DodgeJourney = new Coche("Dodge Journey", Tipo.TODOTERRENO, 140, 4, 315, 190, 11.6, true, Traccion.DELANTERA, Marca.DODGE, 2008, 22800);

    Coche DS5 = new Coche("DS 5", Tipo.SEDAN, 120, 4, 300, 191, 11.7, true, Traccion.DELANTERA, Marca.DS, 2015, 23931);
    Coche DS3 = new Coche("DS 3", Tipo.COUPE, 75, 4, 230, 171, 12.9, true, Traccion.DELANTERA, Marca.DS, 2016, 16342);
    Coche DS4 = new Coche("DS 4", Tipo.SEDAN, 100, 4, 254, 180, 12.3, true, Traccion.DELANTERA, Marca.DS, 2016, 22780);
    Coche Borl = new Coche("Borl",Tipo.SEDAN,123,4,234,132,12,true,Traccion.DELANTERA,Marca.DACIA,2011,22034);
    /**
     * Aqui se añade los coches al array listadecoches
     */
    public CochesDB() {
        listadecoches.add(Borl);
        listadecoches.add(Abarth500);
        listadecoches.add(AbarthGrandePunto);
        listadecoches.add(AbarthPuntoEvo);
        listadecoches.add(AbarthPunto);
        listadecoches.add(Abarth695);
        listadecoches.add(Abarth595);
        listadecoches.add(Abarth124Spider);
        listadecoches.add(AlfaRomeo4C);
        listadecoches.add(AlfaRomeo147);
        listadecoches.add(AlfaRomeo156);
        listadecoches.add(AlfaRomeo159);
        listadecoches.add(AlfaRomeo166);
        listadecoches.add(AlfaRomeoBrera);
        listadecoches.add(AlfaRomeoGiulia);
        listadecoches.add(AlfaRomeoGiulietta);
        listadecoches.add(AlfaRomeoGT);
        listadecoches.add(AlfaRomeoGTV);
        listadecoches.add(AlfaRomeoStelvio);
        listadecoches.add(AlfaRomeoMito);
        listadecoches.add(AlfaRomeoSpider);
        listadecoches.add(AstonMartinCygnet);
        listadecoches.add(AstonMartinDB9);
        listadecoches.add(AstonMartinDBS);
        listadecoches.add(AstonMartinRapide);
        listadecoches.add(AstonMartinVirage);
        listadecoches.add(AstonMartinVantage);
        listadecoches.add(AstonMartinVanquish);
        listadecoches.add(AudiA1);
        listadecoches.add(AudiA2);
        listadecoches.add(AudiA3);
        listadecoches.add(AudiA4);
        listadecoches.add(AudiA5);
        listadecoches.add(AudiA6);
        listadecoches.add(AudiA7);
        listadecoches.add(AudiA8);
        listadecoches.add(AudiCabrio);
        listadecoches.add(AudiQ2);
        listadecoches.add(AudiQ3);
        listadecoches.add(AudiQ5);
        listadecoches.add(AudiQ7);
        listadecoches.add(AudiTT);
        listadecoches.add(AudiR8);
        listadecoches.add(BentleyArnage);
        listadecoches.add(BentleyAzure);
        listadecoches.add(BentleyBentayga);
        listadecoches.add(BentleyBrooklands);
        listadecoches.add(BentleyContinentalFlying);
        listadecoches.add(BentleyContinentalGT);
        listadecoches.add(BentleyMulsanne);
        listadecoches.add(BentleyContinentalGTC);
        listadecoches.add(Bmwi3);
        listadecoches.add(Bmwi8);
        listadecoches.add(BmwSerie1);
        listadecoches.add(BmwSerie2);
        listadecoches.add(BmwSerie2ActiveTourer);
        listadecoches.add(BmwSerie2GranTourer);
        listadecoches.add(BmwSerie3);
        listadecoches.add(BmwSerie3GranTurismo);
        listadecoches.add(BmwSerie4);
        listadecoches.add(BmwSerie5);
        listadecoches.add(BmwSerie5GranTurismo);
        listadecoches.add(BmwSerie6);
        listadecoches.add(BmwSerie7);
        listadecoches.add(BmwZ4);
        listadecoches.add(BmwX1);
        listadecoches.add(BmwX3);
        listadecoches.add(BmwX4);
        listadecoches.add(BmwX5);
        listadecoches.add(BmwX6);
        listadecoches.add(BugattiVeyron);
        listadecoches.add(BugattiVeyronSuperSport);
        listadecoches.add(CadillacATS);
        listadecoches.add(CadillacATSCoupe);
        listadecoches.add(CadillacBls);
        listadecoches.add(CadillacCTS);
        listadecoches.add(CadillacEscalade);
        listadecoches.add(CadillacSRX);
        listadecoches.add(CadillacSTS);
        listadecoches.add(CadillacXLR);
        listadecoches.add(ChevroletAveo);
        listadecoches.add(ChevroletCamaro);
        listadecoches.add(ChevroletCaptiva);
        listadecoches.add(ChevroletCorvette);
        listadecoches.add(ChevroletCruze);
        listadecoches.add(ChevroletEpica);
        listadecoches.add(ChevroletEvanda);
        listadecoches.add(ChevroletHRR);
        listadecoches.add(ChevroletKalos);
        listadecoches.add(ChevroletLacetti);
        listadecoches.add(ChevroletMatiz);
        listadecoches.add(ChevroletNubira);
        listadecoches.add(ChevroletOrlando);
        listadecoches.add(ChevroletSpark);
        listadecoches.add(ChevroletTrax);
        listadecoches.add(ChevroletTrans);
        listadecoches.add(ChevroletVolt);
        listadecoches.add(ChevroletTacuma);
        listadecoches.add(ChevroletTrailBlazer);
        listadecoches.add(ChevroletMalibu);
        listadecoches.add(ChevroletTahoe);
        listadecoches.add(ChryslerCRD);
        listadecoches.add(ChryslerCrossfire);
        listadecoches.add(ChryslerPtCruiserClassic);
        listadecoches.add(ChryslerSebring);
        listadecoches.add(ChryslerVoyager);
        listadecoches.add(CitroenEMehari);
        listadecoches.add(CitroenBerlingo);
        listadecoches.add(CitroenC1);
        listadecoches.add(CitroenC2);
        listadecoches.add(CitroenC3);
        listadecoches.add(CitroenC4);
        listadecoches.add(CitroenC4Aircross);
        listadecoches.add(CitroenC4Cactus);
        listadecoches.add(CitroenC4Picasso);
        listadecoches.add(CitroenC5);
        listadecoches.add(CitroenC6);
        listadecoches.add(CitroenC8);
        listadecoches.add(CitroenCCrosser);
        listadecoches.add(CitroenCElysee);
        listadecoches.add(CitroenCZero);
        listadecoches.add(CitroenGranC4Picasso);
        listadecoches.add(CitroenJumper);
        listadecoches.add(CitroenJumpyMultispace);
        listadecoches.add(CitroenNemo);
        listadecoches.add(CitroenXsara);
        listadecoches.add(CitroenXsaraPicasso);
        listadecoches.add(CitroenXsaraVTS);
        listadecoches.add(CorvetteC6);
        listadecoches.add(CorvetteZ06);
        listadecoches.add(CorvetteZR1);
        listadecoches.add(DaciaDokker);
        listadecoches.add(DaciaDuster);
        listadecoches.add(DaciaLodgy);
        listadecoches.add(DaciaLogan);
        listadecoches.add(DaciaSandero);
        listadecoches.add(DodgeAvenger);
        listadecoches.add(DodgeCaliber);
        listadecoches.add(DodgeChargerHemi);
        listadecoches.add(DodgeNitro);
        listadecoches.add(DodgeJourney);
        listadecoches.add(DodgeViperSRT10);
        listadecoches.add(DS3);
        listadecoches.add(DS4);
        listadecoches.add(DS5);
    }

    /**
     * Metodo que estipula las marcas que existen y las que deberia elegir el usuario.En este caso se pide
     * que el usuario introduzca la marca del coche.Una vez hecho se comparara lo escrito con la "base de datos"
     * Siempre lo escrito se volvera minusculas y se quitaran los espacios para evitar errores y añadir exactitud
     * @return en el caso de que el usuario ponga otra cosa o nada.Por defecto se pondra que es sedan
     */
    public Tipo todoslostipos() {
        Scanner entrada = new Scanner(System.in);
        String tipoelegido;

        System.out.println("Introduzca el tipo de coche (Todoterreno,Sedan,Coupe,Furgoneta,Deportivo) : ");
        tipoelegido = entrada.nextLine();

        if( tipoelegido.toLowerCase().replace(" ", "").equals("todoterreno")){
            return Tipo.TODOTERRENO;
        }else if( tipoelegido.toLowerCase().replace(" ", "").equals("coupe")){
            return Tipo.COUPE;
        }else if( tipoelegido.toLowerCase().replace(" ", "").equals("sedan")){
            return Tipo.SEDAN;
        }else if( tipoelegido.toLowerCase().replace(" ", "").equals("furgoneta")){
            return Tipo.FURGONETA;
        }else if( tipoelegido.toLowerCase().replace(" ", "").equals("deportivo")) {
            return Tipo.DEPORTIVO;
        }
        return Tipo.SEDAN;
    }

    /**
     * Metodo que estipula las tipos de tracciones existentes en los coches.El usuario debera eligir una
     * introducciendola por teclado.Una vez escrito se compara con la "base de datos"
     * Siempre lo escrito se volvera minusculas y se quitaran los espacios para evitar errores y añadir exactitud
     * @return en el caso de que el usuario ponga otra cosa o nada.Por defecto se pondra que es traccion delantera
     */
    public Traccion todoslastracciones() {
        Scanner entrada = new Scanner(System.in);

        String traccionelegida;

        System.out.println("Introduzca el tipo de traccion ( Delantera,Trasera o Todas) :");
        traccionelegida = entrada.nextLine();

        if( traccionelegida.toLowerCase().replace(" ", "").equals("delantera")){
            return Traccion.DELANTERA;
        }else if( traccionelegida.toLowerCase().replace(" ", "").equals("trasera")){
            return Traccion.TRASERA;
        }else if( traccionelegida.toLowerCase().replace(" ","").equals("todas")) {
            return Traccion.TODAS;
        }
        return Traccion.DELANTERA;
    }

    /**
     * Metodo que estipula las marcas que existen y las que deberia elegir el usuario.En este caso se pide
     * que el usuario introduzca la marca del coche.Una vez hecho se comparara lo escrito con la "base de datos"
     * Siempre lo escrito se volvera minusculas y se quitaran los espacios para evitar errores y añadir exactitud
     * @return en el caso de que el usuario ponga otra cosa o nada.Por defecto se pondra que es Abarth
     */
    public Marca todaslasmarcas() {
        Scanner entrada = new Scanner(System.in);

        String marcaelegida;

        System.out.println("Introduzca la marca de su coche :");
        marcaelegida = entrada.nextLine();

        if( marcaelegida.toLowerCase().replace(" ", "").equals("abarth")){
            return Marca.ABARTH;
        }else if( marcaelegida.toLowerCase().replace(" ", "").equals("alfaromeo")){
            return Marca.ALFAROMEO;
        }else if( marcaelegida.toLowerCase().replace(" ","").equals("astonmartin")) {
            return Marca.ASTONMARTIN;
        }else if( marcaelegida.toLowerCase().replace(" ", "").equals("audi")){
            return Marca.AUDI;
        }else if( marcaelegida.toLowerCase().replace(" ","").equals("bentley")) {
            return Marca.BENTLEY;
        }else if( marcaelegida.toLowerCase().replace(" ", "").equals("bmw")){
            return Marca.BMW;
        }else if( marcaelegida.toLowerCase().replace(" ","").equals("bugatti")) {
            return Marca.BUGATTI;
        }else if( marcaelegida.toLowerCase().replace(" ", "").equals("cadillac")){
            return Marca.CADILLAC;
        }else if( marcaelegida.toLowerCase().replace(" ","").equals("chevrolet")) {
            return Marca.CHEVROLET;
        }else if( marcaelegida.toLowerCase().replace(" ", "").equals("chrysler")){
            return Marca.CHRYSLER;
        }else if( marcaelegida.toLowerCase().replace(" ","").replace("ë","e").equals("citroen")) {
            return Marca.CITROEN;
        }else if( marcaelegida.toLowerCase().replace(" ", "").equals("corvette")){
            return Marca.CORVETTE;
        }else if( marcaelegida.toLowerCase().replace(" ","").equals("dacia")) {
            return Marca.DACIA;
        }else if( marcaelegida.toLowerCase().replace(" ", "").equals("dodge")){
            return Marca.DODGE;
        }else if( marcaelegida.toLowerCase().replace(" ","").equals("ds")) {
            return Marca.DS;
        }else if( marcaelegida.toLowerCase().replace(" ", "").equals("ferrari")){
            return Marca.FERRARI;
        }else if( marcaelegida.toLowerCase().replace(" ","").equals("fiat")) {
            return Marca.FIAT;
        }else if( marcaelegida.toLowerCase().replace(" ", "").equals("ford")){
            return Marca.FORD;
        }else if( marcaelegida.toLowerCase().replace(" ","").equals("fso")) {
            return Marca.FSO;
        }else if( marcaelegida.toLowerCase().replace(" ", "").equals("honda")){
            return Marca.HONDA;
        }else if( marcaelegida.toLowerCase().replace(" ","").equals("hummer")) {
            return Marca.HUMMER;
        }else if( marcaelegida.toLowerCase().replace(" ", "").equals("hyundai")){
            return Marca.HYUNDAI;
        }else if( marcaelegida.toLowerCase().replace(" ","").equals("infiniti")) {
            return Marca.INFINITI;
        }else if( marcaelegida.toLowerCase().replace(" ", "").equals("jaguar")){
            return Marca.JAGUAR;
        }else if( marcaelegida.toLowerCase().replace(" ","").equals("jeep")) {
            return Marca.JEEP;
        }else if( marcaelegida.toLowerCase().replace(" ", "").equals("dodge")){
            return Marca.KIA;
        }else if( marcaelegida.toLowerCase().replace(" ","").equals("ds")) {
            return Marca.DS;
        }else if( marcaelegida.toLowerCase().replace(" ", "").equals("lamborghini")){
            return Marca.LAMBORGHINI;
        }else if( marcaelegida.toLowerCase().replace(" ","").equals("lancia")) {
            return Marca.LANCIA;
        }else if( marcaelegida.toLowerCase().replace(" ", "").equals("landrover")){
            return Marca.LANDROVER;
        }else if( marcaelegida.toLowerCase().replace(" ","").equals("lexus")) {
            return Marca.LEXUS;
        }else if( marcaelegida.toLowerCase().replace(" ", "").equals("lotus")){
            return Marca.LOTUS;
        }else if( marcaelegida.toLowerCase().replace(" ","").equals("maserati")) {
            return Marca.MASERATI;
        }else if( marcaelegida.toLowerCase().replace(" ", "").equals("mazda")){
            return Marca.MAZDA;
        }else if( marcaelegida.toLowerCase().replace(" ","").equals("mercury")) {
            return Marca.MERCURY;
        }else if( marcaelegida.toLowerCase().replace(" ", "").equals("mini")){
            return Marca.MINI;
        }else if( marcaelegida.toLowerCase().replace(" ","").equals("mitsubishi")) {
            return Marca.MITSUBISHI;
        }else if( marcaelegida.toLowerCase().replace(" ", "").equals("nissan")){
            return Marca.NISSAN;
        }else if( marcaelegida.toLowerCase().replace(" ","").equals("opel")) {
            return Marca.OPEL;
        }else if( marcaelegida.toLowerCase().replace(" ", "").equals("peugeot")){
            return Marca.PEUGEOT;
        }else if( marcaelegida.toLowerCase().replace(" ","").equals("pontiac")) {
            return Marca.PONTIAC;
        }else if( marcaelegida.toLowerCase().replace(" ", "").equals("porsche")){
            return Marca.PORSCHE;
        }else if( marcaelegida.toLowerCase().replace(" ","").equals("renault")) {
            return Marca.RENAULT;
        }else if( marcaelegida.toLowerCase().replace(" ", "").equals("rollsroyce")){
            return Marca.ROLLSROYCE;
        }else if( marcaelegida.toLowerCase().replace(" ","").equals("rover")) {
            return Marca.ROVER;
        }else if( marcaelegida.toLowerCase().replace(" ", "").equals("saab")){
            return Marca.SAAB;
        }else if( marcaelegida.toLowerCase().replace(" ","").equals("seat")) {
            return Marca.SEAT;
        }else if( marcaelegida.toLowerCase().replace(" ", "").equals("skoda")){
            return Marca.SKODA;
        }else if( marcaelegida.toLowerCase().replace(" ","").equals("smart")) {
            return Marca.SMART;
        }else if( marcaelegida.toLowerCase().replace(" ", "").equals("ssangyong")){
            return Marca.SSANGYONG;
        }else if( marcaelegida.toLowerCase().replace(" ","").equals("subaru")) {
            return Marca.SUBARU;
        }else if( marcaelegida.toLowerCase().replace(" ", "").equals("suzuki")){
            return Marca.SUZUKI;
        }else if( marcaelegida.toLowerCase().replace(" ","").equals("tesla")) {
            return Marca.TESLA;
        }else if( marcaelegida.toLowerCase().replace(" ","").equals("toyota")) {
            return Marca.TOYOTA;
        }else if( marcaelegida.toLowerCase().replace(" ", "").equals("tvr")){
            return Marca.TVR;
        }else if( marcaelegida.toLowerCase().replace(" ","").equals("volkwagen")) {
            return Marca.VOLKSWAGEN;
        }else if( marcaelegida.toLowerCase().replace(" ", "").equals("volvo")){
            return Marca.VOLVO;
        }

        return Marca.ABARTH;
    }

    /**
     * Metodo que muestra todos los coches que hay creados en el array
      */
    public void mostrarCoches() {
        Scanner entrada = new Scanner(System.in);

        for (Coche coche : listadecoches) {
            System.out.println(coche);
        }
        System.out.println("");
        System.out.println("Pulsar Enter Para seguir");
        entrada.nextLine();
    }

    /**
     * Metodo que busca un coche de la lista de coches .Se crea un atributo llamado nombre que te pide por teclado.
     * Busca ese nombre(en minusculas) por toddo el array y una vez que lo a encontrado lo imprime.En el caso
     * que no lo encuentre ,devuelve un return que te saca del metodo y muestra el mensaje de que no se encuentra el coche.
     */
    public void buscarcoche() {
        String nombre;

        System.out.println("Escriba el coche que desea encontrar");
        nombre = entrada.nextLine().toLowerCase().replace(" ", "");

        for (Coche coche : listadecoches) {
            if (nombre.equals(coche.getNombre().toLowerCase().replace(" ", ""))) {
                System.out.println(coche);
                return;
            }
        }
        System.out.println("No se a encontrado coincidencias con el coche que desea encontrar");

    }
    /**
     * Metodo que crea un coche con todos sus atributos necesarios pedidos al usuario mediante el teclado.
     * Se pasa por todos los atributos un exception para evitar que en los datos que se pidan numericos
     * los usuarios metan letras y por ello de error(Mostrara un mensaje y devolvera al usuario al menu)
     * @param coche hecho una variable local.
     */

    public void crearCoche(Coche coche) {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        Tipo tipo;
        int potencia;
        int cilindros;
        int parMaxima;
        int velocidadMaxima;
        double acceleracion;
        boolean turbo;
        Traccion traccion;
        Marca marca;
        int año;
        double precio;

        System.out.println("Introduzca el nombre del coche:");
        nombre = entrada.nextLine();

        /**
         * tipo obtiene el valor que le da por el metodo todoslostipos
         */
        tipo = todoslostipos();

        try {

            System.out.println("Introduzca los caballos:");
            potencia = entrada.nextInt();

            System.out.println("Introduzca cuantos cilindros lleva equipado:");
            cilindros = entrada.nextInt();

            System.out.println("Introduzca la par maximo:");
            parMaxima = entrada.nextInt();

            System.out.println("Introduzca la velocidad maxima que alcanza:");
            velocidadMaxima = entrada.nextInt();

            System.out.println("Introduzca cuantos segundos tarda de 0-100Km/h :");
            acceleracion = entrada.nextDouble();

            /**
             * Limpia la entrada del scanner para que no de error
             */
            entrada.nextLine();

            /**
             * Lo que se escriba por teclado se vuelve minusculas y se sustituye la tilde para que no de error.En caso de que el
             * Usuario ponga que si,el valor turbo sera true ,en caso de que se ponga otra sera que no.
             */
            System.out.println("Introduzca si tiene equipado turbo:");
            turbo = entrada.nextLine().toLowerCase().replace("í","i").equals("si");

            /**
             * traccion obtine el valor que se le da por el metodo todaslastracciones
             */
            traccion = todoslastracciones();

            /**
             * marca obtiene el valor que se le da por el metodo todaslasmarcas
             */
            marca = todaslasmarcas();

            System.out.println("Introduzca el año de venta:");
            año = entrada.nextInt();

            System.out.println("Introduzca el precio total del coche:");
            precio = entrada.nextDouble();

        }catch (InputMismatchException e) {
            System.out.println("El valor introducido es incorrecto.Debe ingresar un valor numerico.");
            return ;
        }

        coche = new Coche(nombre, tipo, potencia, cilindros, parMaxima, velocidadMaxima, acceleracion, turbo, traccion, marca, año, precio);

        if (coche != null) {
            listadecoches.add(coche);
            System.out.println("Se a creado satisfactoriamente el coche");
        }

    }


    /**
     * Metodo que elimina un coche de la lista de coches .Se crea un atributo llamado nombre que te pide por teclado.
     * Busca ese nombre(en minusculas) por toddo el array y una vez que lo a encontrado lo elimina.En el caso
     * que no lo encuentre ,devuelve un return que te saca del metodo y muestra el mensaje de que no se encuentra el coche.
     */
    public void EliminarCoche() {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        Iterator<Coche> itCoche = listadecoches.iterator();

        System.out.println("Escriba el coche que desea borrar");
        nombre = entrada.nextLine().toLowerCase();

        while (itCoche.hasNext()) {
            Coche coche = itCoche.next();

            if (coche.getNombre().toLowerCase().equals(nombre)) {
                itCoche.remove();
                System.out.println("El coche a sido borrado Satisfactoriamente");
                return;
            }
        }
        System.out.println("No se a encontrado coincidencias con el coche que desea borrar");
    }


    /**
     * Metodo que añade un coche a favoritos ya creado en el array de todos los coches.Mediante el nombre pedido por teclado
     * se repasa el array hasta encontrarlo,una vez hecho clona todos los datos del mismo y lo mueve al array de coches favoritos.
     * En caso de que no encuentre el nombre del coche,mostrara un mensaje de error.
     */
    public void añadirCocheFavoritos() {
        String nombre;
        Iterator<Coche> itCoche = listadecoches.iterator();

        System.out.println("Escriba el coche que desea añadir");
        nombre = entrada.nextLine().toLowerCase();


        while (itCoche.hasNext()) {
            Coche coche = itCoche.next();

            if (coche.getNombre().toLowerCase().equals(nombre)) {
                listadecochesfavoritos.add(coche.clone());
                System.out.println("El coche a sido añadido Satisfactoriamente");
                return;
            }

        }
        System.out.println("No se a encontrado el coche para ser añadido,intentelo de nuevo");
    }

    /**
     * Metodo que muestra la lista de coches favoritos,lee el array listadecochesfavoritos e imprime todos los coches creados en ella.
     * En el caso de que no haya ningun coche creado en el array ,muestra el mensaje de que esta vacio.
     * Finalmente se imprime un mensaje por pantalla para que no salga de sopeton y le tengas que dar a intro.
     */
    public void mostrarCochesFavoritos() {
        Scanner entrada = new Scanner(System.in);

        for (Coche coche : listadecochesfavoritos) {
            System.out.println(coche);
        }

        if(listadecochesfavoritos.size() == 0){
            System.out.println("No hay ningun coche añadido a favoritos");
        }

        System.out.println("");
        System.out.println("Pulsar Enter Para seguir");
        entrada.nextLine();
    }


    /**
     * Metodo que elimina un coche de la lista de coches favoritos .Se crea un atributo llamado nombre que te pide por teclado.
     * Busca ese nombre(en minusculas) por toddo el array y una vez que lo a encontrado lo elimina.En el caso
     * que no lo encuentre ,devuelve un return que te saca del metodo y muestra el mensaje de que no se encuentra el coche.
     */
    public void EliminarCochedefavoritos() {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        Iterator<Coche> itCoche = listadecochesfavoritos.iterator();

        System.out.println("Escriba el coche que desea borrar");
        nombre = entrada.nextLine().toLowerCase();

        while (itCoche.hasNext()) {
            Coche coche = itCoche.next();

            if (coche.getNombre().toLowerCase().equals(nombre)) {
                itCoche.remove();
                System.out.println("El coche a sido borrado Satisfactoriamente");
                return;
            }
        }
        System.out.println("No se a encontrado el coche para ser borrado");
    }

    /**
     * Metodo que ordena los coches por nombre del array listadecoches
     */
    public void ordenarpornombre(){
        Collections.sort(listadecoches,Coche.comparadornombre);

        mostrarCoches();
    }

    /**
     *  Metodo que ordena los coches por velocidad maxima del array listadecoches
     */
    public void ordenarporvelocidad(){
        Collections.sort(listadecoches,Coche.comparadorvelocidad);

        mostrarCoches();
    }

    /**
     *  Metodo que ordena los coches por precio de menor a mayor del array listadecoches
     */
    public void ordenarporprecio(){
        Collections.sort(listadecoches,Coche.comparadorprecio);

        mostrarCoches();
    }

    /**
     *  Metodo que ordena los coches por los caballos(cv) que tiene, del array listadecoches
     */
    public void ordenarporcaballos(){
        Collections.sort(listadecoches,Coche.comparadorcaballos);

        mostrarCoches();
    }

    /**
     * Metodo que guarda el estado final del programa en el archivo coches.dat.Pudiendo haber hecho cualquier
     * cosa el usuario y siendo guardado.Tanto en el array de favoritos como el de lista normal de coches.
     */
    public void guardarCoches() {
        try {
            ObjectOutputStream guardarCoches = new ObjectOutputStream(new FileOutputStream("Coches.dat"));

            guardarCoches.writeObject( listadecoches );
            guardarCoches.writeObject(listadecochesfavoritos);

            guardarCoches.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Metodo que carga toodo lo que se a hecho anteriormente en el programa por el usuario.Y saca la informacion
     * del archivo coches.dat
     */
    public void cargarCoches() {
        try {
            ObjectInputStream cargarCoches = new ObjectInputStream(new FileInputStream("Coches.dat"));

            listadecoches = (ArrayList<Coche>) cargarCoches.readObject();
            listadecochesfavoritos = (ArrayList<Coche>) cargarCoches.readObject();


            cargarCoches.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}




