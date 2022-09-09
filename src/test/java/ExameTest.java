import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExameTest {
    @Test
    public void testevalorzero(){
        try{
            Exame exame = new Exame();
            exame.setTriglicerides(0);
            exame.examinarTriglicerides();
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("Valor abaixo ou igual a zero", e.getMessage());
        }
    }

    @Test
    public void testeTrigliceridesBaixo(){
        Exame exame = new Exame();
        exame.setTriglicerides(149);
        assertEquals("Nivel desejável", exame.examinarTriglicerides());
    }

    @Test
    public void testeTrigliceridesLimitrofe(){
        Exame exame = new Exame();
        exame.setTriglicerides(199);
        assertEquals("Nivel limitrofe", exame.examinarTriglicerides());
    }
    @Test
    public void testeTrigliceridesAlto(){
        Exame exame = new Exame();
        exame.setTriglicerides(499);
        assertEquals("Nivel alto", exame.examinarTriglicerides());
    }
    @Test
    public void testeTrigliceridesMuitoAlto(){
        Exame exame = new Exame();
        exame.setTriglicerides(500);
        assertEquals("Nivel muito alto", exame.examinarTriglicerides());
    }
    @Test
    public void testeColesterolTotaldesejavel(){
        Exame exame = new Exame();
        exame.setColesterolTotal(199);
        assertEquals("Nivel desejável", exame.examinarColesterolTotal());
    }
    @Test
    public void testeColesterolTotalLimitrofe(){
        Exame exame = new Exame();
        exame.setColesterolTotal(239);
        assertEquals("Nivel limitrofe", exame.examinarColesterolTotal());
    }
    @Test
    public void testeColesterolTotalElevado(){
        Exame exame = new Exame();
        exame.setColesterolTotal(240);
        assertEquals("Nivel elevado", exame.examinarColesterolTotal());
    }
    @Test
    public void testeColesterolHDLBaixo(){
        Exame exame = new Exame();
        exame.setColesterolHDL(39);
        assertEquals("Nivel baixo", exame.examinarColesterolHDL());
    }
    @Test
    public void testeColesterolHDLNormal(){
        Exame exame = new Exame();
        exame.setColesterolHDL(60);
        assertEquals("Nivel normal", exame.examinarColesterolHDL());
    }
    @Test
    public void testeColesterolHDLDesejavel(){
        Exame exame = new Exame();
        exame.setColesterolHDL(61);
        assertEquals("Nivel desejável", exame.examinarColesterolHDL());
    }
    @Test
    public void testeColesterolLDLOtimo(){
        Exame exame = new Exame();
        exame.setColesterolLDL(99);
        assertEquals("Nivel otimo", exame.examinarColesterolLDL());
    }
    @Test
    public void testeColesterolLDLDesejavel(){
        Exame exame = new Exame();
        exame.setColesterolLDL(129);
        assertEquals("Nivel desejável", exame.examinarColesterolLDL());
    }
    @Test
    public void testeColesterolLDLLimitrofe(){
        Exame exame = new Exame();
        exame.setColesterolLDL(159);
        assertEquals("Nivel limitrofe", exame.examinarColesterolLDL());
    }
    @Test
    public void testeColesterolLDLAlto(){
        Exame exame = new Exame();
        exame.setColesterolLDL(189);
        assertEquals("Nivel alto", exame.examinarColesterolLDL());
    }
    @Test
    public void testeColesterolLDLMuitoAlto(){
        Exame exame = new Exame();
        exame.setColesterolLDL(190);
        assertEquals("Nivel muito alto", exame.examinarColesterolLDL());
    }
    @Test
    public void testeColesterolVLDLdesejavel(){
        Exame exame = new Exame();
        exame.setColesterolVLDL(29);
        assertEquals("Nivel desejável", exame.examinarColesterolVLDL());
    }
    @Test
    public void testeColesterolVLDLLimitrofe(){
        Exame exame = new Exame();
        exame.setColesterolVLDL(40);
        assertEquals("Nivel limitrofe", exame.examinarColesterolVLDL());
    }
    @Test
    public void testeColesterolVLDLElevado(){
        Exame exame = new Exame();
        exame.setColesterolVLDL(41);
        assertEquals("Nivel elevado", exame.examinarColesterolVLDL());
    }
    @Test
    public void testeGlicoseHipoglicemia(){
        Exame exame = new Exame();
        exame.setGlicose(59);
        assertEquals("hipoglicemia", exame.examinarGlicose());
    }
    @Test
    public void testeGlicosedesejavel(){
        Exame exame = new Exame();
        exame.setGlicose(99);
        assertEquals("Nivel desejavel", exame.examinarGlicose());
    }
    @Test
    public void testeGlicoseInapropriada(){
        Exame exame = new Exame();
        exame.setGlicose(125);
        assertEquals("Glicemia de jejum inapropriada", exame.examinarGlicose());
    }
    @Test
    public void testeGlicoseDiabetes(){
        Exame exame = new Exame();
        exame.setGlicose(126);
        assertEquals("Diabetes", exame.examinarGlicose());
    }

}
