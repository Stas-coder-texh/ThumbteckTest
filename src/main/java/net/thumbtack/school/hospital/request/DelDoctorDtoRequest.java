package net.thumbtack.school.hospital.request;

public class DelDoctorDtoRequest {
    private final String token;

    public DelDoctorDtoRequest(String token) {
        this.token = token;
    }
    public String getToken() {
        return token;
    }

}
