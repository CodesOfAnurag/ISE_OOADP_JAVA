import java.io.File;

public class VideoConversionFacade {
    
    public File convert(String fileName, String format) {
        System.out.println("-".repeat(50));
        System.out.println("VideoConversionFacade: conversion started.");
        System.out.println("-".repeat(50));
        
        Video file = new Video(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;

        if (format.equals("mp4"))
            destinationCodec = new OggCompressionCodec();
        else 
            destinationCodec = new MPEG4CompressionCodec();
        
        Video buffer = GetBitrate.read(file, sourceCodec);
        
        Video intermediateResult = GetBitrate.convert(buffer, destinationCodec);

        File result = (new AudioMixer()).fix(intermediateResult);
        
        System.out.println("-".repeat(50));
        System.out.println("VideoConversionFacade: conversion completed.");
        System.out.println("-".repeat(50));
        
        return result;
    }
}