package test;

import java.io.IOException;

import ie.corballis.sox.SoXEffect;
import ie.corballis.sox.Sox;
import ie.corballis.sox.WrongParametersException;

public class TestSox {
	public static void main(String[] args) throws IOException, WrongParametersException {
		Sox sox = new Sox();
        sox
        	.device("0")
        	.inputFile("-n")
        	.outputFile("-d")
            .effect(SoXEffect.SYNTH, "2")
            .argument("sine", "300-500")
            .execute();
    }
}