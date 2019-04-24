package net.covass.service;

import java.io.IOException;

import net.bramp.ffmpeg.FFmpeg;
import net.bramp.ffmpeg.FFmpegExecutor;
import net.bramp.ffmpeg.FFprobe;
import net.bramp.ffmpeg.builder.FFmpegBuilder;
 
public class VideoTimeCut {
    /**
     * 입력 영상의 구간을 잘라서 새로운 영상을 만드는 FFMPEG 명령어를 자바로
     * 구현 한 소스
     * @param args
     */
    private static final String inputPath = "http://root:123@192.168.15.139/mjpg/video.mjpg";
    private static final String outputPath = "C:\\Temp\\";
     
    public static void save() throws IOException {
        FFmpeg ffmpeg = new FFmpeg("C:\\Users\\user\\Downloads\\ffmpeg-4.1.1-win64-static\\bin\\ffmpeg");
        System.out.println("1");
        FFprobe ffprobe = new FFprobe("C:\\Users\\user\\Downloads\\ffmpeg-4.1.1-win64-static\\bin\\ffprobe");
        System.out.println("2");
        //다음번 영상 merge를 위해서 3개의 영상 생성
        FFmpegBuilder builder = new FFmpegBuilder()

        		  .setInput(inputPath)     // Filename, or a FFmpegProbeResult
        		  .overrideOutputFiles(true) // Override the output if it exists
        		  .addExtraArgs("-r","8")
        		  
        		  .addExtraArgs("-t", "10")
        		  .addExtraArgs("-an")
        		  .addOutput(outputPath+"CCTV001.mp4") 
        		  .setAudioBitRate(32768)// Filename for the destination
        		  .setVideoCodec("libx264")     // Video using x264
        		  //.setStrict(FFmpegBuilder.Strict.EXPERIMENTAL) // Allow FFmpeg to use experimental specs
        		  .done();

        		FFmpegExecutor executor = new FFmpegExecutor(ffmpeg, ffprobe);
        		executor.createJob(builder).run();
        //		executor.createTwoPassJob(builder).run();
        }
    
    }



