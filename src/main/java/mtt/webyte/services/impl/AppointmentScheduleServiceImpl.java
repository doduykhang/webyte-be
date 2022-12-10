package mtt.webyte.services.impl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import mtt.webyte.dto.AppointmentScheduleDTO;
import mtt.webyte.mapper.AppointmentScheduleMapper;
import mtt.webyte.model.AppointmentSchedule;
import mtt.webyte.repository.AppointmentScheduleRepository;
import mtt.webyte.services.AppointmentScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
@Getter
@Setter
public class AppointmentScheduleServiceImpl extends AbstractServiceImpl<AppointmentScheduleRepository, AppointmentScheduleMapper, AppointmentScheduleDTO, AppointmentSchedule> implements AppointmentScheduleService {
    private final AppointmentScheduleRepository appointmentScheduleRepository;
    private final AppointmentScheduleMapper appointmentScheduleMapper;

    @Override
    public List<AppointmentSchedule> getAllListAppointmentSchedule() {
        return appointmentScheduleRepository.findAll();
    }

    @Override
    public List<AppointmentScheduleDTO> getAllAppointmentSchedule() throws ParseException {
        return null;
    }

    @Override
    public List<AppointmentScheduleDTO> getAllAppointmentScheduleByDoctor(int id) {
        return null;
    }

    @Override
    public AppointmentSchedule getAppointmentSchedule(int key) {
        return null;
    }

    @Override
    public AppointmentSchedule insertAppointmentSchedule(AppointmentSchedule appointmentSchedule) {
        return null;
    }

    @Override
    public AppointmentSchedule updateAppointmentSchedule(AppointmentSchedule appointmentSchedule) {
        return null;
    }

    @Override
    public int deleteAppointmentSchedule(int id) {
        return 0;
    }

    @Override
    public AppointmentSchedule selectTop1Appoint() {
        return null;
    }

    @Override
    public List<Map<String, Object>> getCountTimeFull(Date date) {
        return null;
    }

    @Override
    public AppointmentScheduleDTO getAppointmentScheduleById(int id) {
        return null;
    }

    @Override
    public AppointmentSchedule updateStatus(int id, String status) {
        return null;
    }

    @Override
    public Map<String, Object> getAppointDate(int id) {
        return null;
    }

    @Override
    public AppointmentScheduleDTO save(AppointmentScheduleDTO dto) {
        return null;
    }

    @Override
    public AppointmentSchedule save(AppointmentSchedule entity) {
        return null;
    }

    @Override
    public AppointmentScheduleDTO saveAndFlush(AppointmentScheduleDTO dto) {
        return null;
    }

    @Override
    public AppointmentSchedule saveAndFlush(AppointmentSchedule entity) {
        return null;
    }

    @Override
    public AppointmentScheduleDTO save() {
        return null;
    }

    @Override
    public List<AppointmentScheduleDTO> save(List<AppointmentScheduleDTO> dtos) {
        return null;
    }

    @Override
    public AppointmentScheduleDTO findById(long id) {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void delete(AppointmentScheduleDTO dto) {

    }

    @Override
    public List<AppointmentScheduleDTO> findAll() {
        return null;
    }

    @Override
    public AppointmentScheduleDTO findById(Object id) {
        return null;
    }

    @Override
    public AppointmentSchedule findEntityById(Object id) {
        return null;
    }

    @Override
    public void delete(Object dto) {

    }

    @Override
    public Pageable getPageable(Integer page, Integer size, boolean sortASC, String by) {
        return null;
    }

    @Override
    public Pageable getPageable(Integer page, Integer size) {
        return null;
    }
}