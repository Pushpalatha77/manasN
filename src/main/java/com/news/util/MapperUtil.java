package com.news.util;

import com.news.dto.AdvertisementDTO;
import com.news.dto.AdvertiserDTO;
import com.news.dto.BookingDTO;
import com.news.dto.NewspaperDTO;
import com.news.dto.PaymentDTO;
import com.news.dto.UserDTO;
import com.news.entity.Advertisement;
import com.news.entity.Advertiser;
import com.news.entity.Booking;
import com.news.entity.Newspaper;
import com.news.entity.Payment;
import com.news.entity.User;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

import java.util.List;

public class MapperUtil {
    private static ModelMapper modelMapper = new ModelMapper();

    public static UserDTO mapUserToDTO(User user) {
        return modelMapper.map(user, UserDTO.class);
    }

    public static AdvertisementDTO mapAdvertisementToDTO(Advertisement advertisement) {
        return modelMapper.map(advertisement, AdvertisementDTO.class);
    }

    public static AdvertiserDTO mapAdvertiserToDTO(Advertiser advertiser) {
        return modelMapper.map(advertiser, AdvertiserDTO.class);
    }

    public static BookingDTO mapBookingToDTO(Booking booking) {
        return modelMapper.map(booking, BookingDTO.class);
    }

    public static NewspaperDTO mapNewspaperToDTO(Newspaper newspaper) {
        return modelMapper.map(newspaper, NewspaperDTO.class);
    }

    public static PaymentDTO mapPaymentToDTO(Payment payment) {
        return modelMapper.map(payment, PaymentDTO.class);
    }

    public static User mapDTOToUser(UserDTO userDTO) {
        return modelMapper.map(userDTO, User.class);
    }

    public static Advertisement mapDTOToAdvertisement(AdvertisementDTO advertisementDTO) {
        return modelMapper.map(advertisementDTO, Advertisement.class);
    }

    public static Advertiser mapDTOToAdvertiser(AdvertiserDTO advertiserDTO) {
        return modelMapper.map(advertiserDTO, Advertiser.class);
    }

    public static Booking mapDTOToBooking(BookingDTO bookingDTO) {
        return modelMapper.map(bookingDTO, Booking.class);
    }

    public static Newspaper mapDTOToNewspaper(NewspaperDTO newspaperDTO) {
        return modelMapper.map(newspaperDTO, Newspaper.class);
    }

    public static Payment mapDTOToPayment(PaymentDTO paymentDTO) {
        return modelMapper.map(paymentDTO, Payment.class);
    }

    public static List<UserDTO> mapUserListToDTO(List<User> userList) {
        return modelMapper.map(userList, new TypeToken<List<UserDTO>>() {}.getType());
    }

    public static List<AdvertisementDTO> mapAdvertisementListToDTO(List<Advertisement> advertisementList) {
        return modelMapper.map(advertisementList, new TypeToken<List<AdvertisementDTO>>() {}.getType());
    }

    public static List<AdvertiserDTO> mapAdvertiserListToDTO(List<Advertiser> advertiserList) {
        return modelMapper.map(advertiserList, new TypeToken<List<AdvertiserDTO>>() {}.getType());
    }

    public static List<BookingDTO> mapBookingListToDTO(List<Booking> bookingList) {
        return modelMapper.map(bookingList, new TypeToken<List<BookingDTO>>() {}.getType());
    }

    public static List<NewspaperDTO> mapNewspaperListToDTO(List<Newspaper> newspaperList) {
        return modelMapper.map(newspaperList, new TypeToken<List<NewspaperDTO>>() {}.getType());
    }

    public static List<PaymentDTO> mapPaymentListToDTO(List<Payment> paymentList) {
        return modelMapper.map(paymentList, new TypeToken<List<PaymentDTO>>() {}.getType());
    }

    // Add mapping methods for other entities if needed

    public static List<User> mapDTOListToUser(List<UserDTO> userDTOList) {
        return modelMapper.map(userDTOList, new TypeToken<List<User>>() {}.getType());
    }

    public static List<Advertisement> mapDTOListToAdvertisement(List<AdvertisementDTO> advertisementDTOList) {
        return modelMapper.map(advertisementDTOList, new TypeToken<List<Advertisement>>() {}.getType());
    }

    public static List<Advertiser> mapDTOListToAdvertiser(List<AdvertiserDTO> advertiserDTOList) {
        return modelMapper.map(advertiserDTOList, new TypeToken<List<Advertiser>>() {}.getType());
    }

    public static List<Booking> mapDTOListToBooking(List<BookingDTO> bookingDTOList) {
        return modelMapper.map(bookingDTOList, new TypeToken<List<Booking>>() {}.getType());
    }

    public static List<Newspaper> mapDTOListToNewspaper(List<NewspaperDTO> newspaperDTOList) {
        return modelMapper.map(newspaperDTOList, new TypeToken<List<Newspaper>>() {}.getType());
    }

    public static List<Payment> mapDTOListToPayment(List<PaymentDTO> paymentDTOList) {
        return modelMapper.map(paymentDTOList, new TypeToken<List<Payment>>() {}.getType());
    }
}

