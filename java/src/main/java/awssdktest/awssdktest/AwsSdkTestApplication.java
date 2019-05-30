package awssdktest.awssdktest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.Bucket;

@SpringBootApplication
public class AwsSdkTestApplication {

    public static void main(String[] args) {
        System.out.println("Running...");

        Region region = Region.US_WEST_2;
        S3Client s3 = S3Client.builder().region(region).build();
        for (Bucket bucket : s3.listBuckets().buckets()) {
            System.out.println(bucket.name());
        }
    }

}