package model.entities;

import model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservas {
    private Integer numeroQuarto;
    private Date checkIn;
    private Date checkOut;

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservas(Integer numeroQuarto, Date checkIn, Date checkOut) {
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Erro na reserva: A data de check-out deve ser após a data de check-in");
        }
        this.numeroQuarto = numeroQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duracao() {
        long dif = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkIn, Date chackOut) {
        Date agora = new Date();
        if (checkIn.before(agora) || checkOut.before(agora)) {
            throw new DomainException("Erro na reserva: As datas da reserva para atualização devem ser futuras");
        } else if (!checkOut.after(checkIn)) {
            throw new DomainException("Erro na reserva: A data de check-out deve ser após a data de check-in");
        }
        this.checkIn = checkIn;
        this.checkOut = chackOut;
    }

    @Override
    public String toString() {
        return "Reservado: Quarto "
                + numeroQuarto
                + ", check-in: "
                + sdf.format(checkIn)
                + ", check-out: "
                + sdf.format(checkOut)
                + ", " + duracao()
                + " noites";
    }
}