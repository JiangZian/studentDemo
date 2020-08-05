import java.io.File;

import it.sauronsoftware.jave.*;

public class Snippet {
    public static void main(String[] args) {
        File source = new File("F:\\婚礼\\花絮.mp4");
        File target = new File("F:\\婚礼\\花絮3.mp4");
        try {

            AudioAttributes audio = new AudioAttributes();
            audio.setCodec("libmp3lame");
            audio.setBitRate(new Integer(64000));
            audio.setChannels(new Integer(1));
            audio.setSamplingRate(new Integer(22050));
            VideoAttributes video = new VideoAttributes();
            video.setCodec("mpeg4");
            video.setBitRate(new Integer(160000));
            video.setFrameRate(new Integer(15));
            video.setSize(new VideoSize(1024, 768));
            EncodingAttributes attrs = new EncodingAttributes();//1024x768
            attrs.setFormat("mp4");
            attrs.setAudioAttributes(audio);
            attrs.setVideoAttributes(video);
            Encoder encoder = new Encoder();
            encoder.encode(source, target, attrs);
        } catch (EncoderException e) {
            e.printStackTrace();
        }
    }
}