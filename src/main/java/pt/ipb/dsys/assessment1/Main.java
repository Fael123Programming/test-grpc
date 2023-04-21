package pt.ipb.dsys.assessment1;

/**
 * 1st Assessment (3)
 * Triangle (variant-6)
 * Rafael (314883)
 */

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    ManagedChannel channel = ManagedChannelBuilder
            .forAddress("127.0.0.1", 8888)
            .usePlaintext()
            .build();
    TriangleGrpc.TriangleBlockingStub triangleStub = TriangleGrpc.newBlockingStub(channel);
    TriangleParam triangleParam = TriangleParam.newBuilder().setBase(314883).setHeight(314883).build();
    Scalar resultScalar = triangleStub.area(triangleParam);
    logger.info("Triangle area: {} * {} / 2 = {}", triangleParam.getBase(), triangleParam.getHeight(),
            resultScalar.getValue());
  }
}