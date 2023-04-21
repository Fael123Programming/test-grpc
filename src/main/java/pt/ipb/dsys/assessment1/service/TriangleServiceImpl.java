package pt.ipb.dsys.assessment1.service;

import io.grpc.stub.StreamObserver;
import pt.ipb.dsys.assessment1.Scalar;
import pt.ipb.dsys.assessment1.TriangleGrpc;
import pt.ipb.dsys.assessment1.TriangleParam;

public class TriangleServiceImpl extends TriangleGrpc.TriangleImplBase {
    @Override
    public void area(TriangleParam request, StreamObserver<Scalar> reply) {
        double base = request.getBase(), height = request.getHeight();
        reply.onNext(Scalar.newBuilder().setValue(base * height / 2).build());
        reply.onCompleted();
    }
}
