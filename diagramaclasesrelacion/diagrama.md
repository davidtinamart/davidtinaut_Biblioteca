classDiagram
direction BT
class Biblioteca {
  - OffsetDateTime dateCreated
  - Long id
  - OffsetDateTime lastUpdated
  - String nombre
  + getDateCreated() OffsetDateTime
  + getId() Long
  + getLastUpdated() OffsetDateTime
  + getNombre() String
  + setDateCreated(OffsetDateTime) void
  + setId(Long) void
  + setLastUpdated(OffsetDateTime) void
  + setNombre(String) void
}
class Bibliotecario {
  - String apellido
  - OffsetDateTime dateCreated
  - String dni
  - Long id
  - OffsetDateTime lastUpdated
  - Lector lector
  - String nombre
  - Set~Prestamo~ prestamos
  - String zona
  + getApellido() String
  + getDateCreated() OffsetDateTime
  + getDni() String
  + getId() Long
  + getLastUpdated() OffsetDateTime
  + getLector() Lector
  + getNombre() String
  + getPrestamos() Set~Prestamo~
  + getZona() String
  + setApellido(String) void
  + setDateCreated(OffsetDateTime) void
  + setDni(String) void
  + setId(Long) void
  + setLastUpdated(OffsetDateTime) void
  + setLector(Lector) void
  + setNombre(String) void
  + setPrestamos(Set~Prestamo~) void
  + setZona(String) void
}
class BibliotecarioController {
  - BibliotecarioService bibliotecarioService
  - LectorRepository lectorRepository
  + add(BibliotecarioDTO) String
  + add(BibliotecarioDTO, BindingResult, RedirectAttributes) String
  + delete(Long, RedirectAttributes) String
  + edit(Long, BibliotecarioDTO, BindingResult, RedirectAttributes) String
  + edit(Long, Model) String
  + list(Model) String
  + prepareContext(Model) void
}
class BibliotecarioDTO {
  - String apellido
  - String dni
  - Long id
  - Long lector
  - String nombre
  - String zona
  + getApellido() String
  + getDni() String
  + getId() Long
  + getLector() Long
  + getNombre() String
  + getZona() String
  + setApellido(String) void
  + setDni(String) void
  + setId(Long) void
  + setLector(Long) void
  + setNombre(String) void
  + setZona(String) void
}
class BibliotecarioRepository {
<<Interface>>
  + existsByLectorId(Long) boolean
  + findFirstByLector(Lector) Bibliotecario
}
class BibliotecarioResource {
  - BibliotecarioService bibliotecarioService
  + createBibliotecario(BibliotecarioDTO) ResponseEntity~Long~
  + deleteBibliotecario(Long) ResponseEntity~Void~
  + getAllBibliotecarios() ResponseEntity~List~BibliotecarioDTO~~
  + getBibliotecario(Long) ResponseEntity~BibliotecarioDTO~
  + updateBibliotecario(Long, BibliotecarioDTO) ResponseEntity~Long~
}
class BibliotecarioService {
  - BibliotecarioRepository bibliotecarioRepository
  - LectorRepository lectorRepository
  - PrestamoRepository prestamoRepository
  + create(BibliotecarioDTO) Long
  + delete(Long) void
  + findAll() List~BibliotecarioDTO~
  + get(Long) BibliotecarioDTO
  + getReferencedWarning(Long) String
  + lectorExists(Long) boolean
  - mapToDTO(Bibliotecario, BibliotecarioDTO) BibliotecarioDTO
  - mapToEntity(BibliotecarioDTO, Bibliotecario) Bibliotecario
  + update(Long, BibliotecarioDTO) void
}
class BibliotecatinautApplication {
  + main(String[]) void
}
class ControllerConfig {
  ~ initBinder(WebDataBinder) void
}
class CustomCollectors {
  + toSortedMap(Function~T, K~, Function~T, U~) Collector~T, ?, Map~K, U~~
}
class DomainConfig {
  + dateTimeProvider() DateTimeProvider
}
class ErrorResponse {
  - String exception
  - List~FieldError~ fieldErrors
  - Integer httpStatus
  - String message
  + getException() String
  + getFieldErrors() List~FieldError~
  + getHttpStatus() Integer
  + getMessage() String
  + setException(String) void
  + setFieldErrors(List~FieldError~) void
  + setHttpStatus(Integer) void
  + setMessage(String) void
}
class Estado {
<<enumeration>>
  +  DANADO
  +  DISPONIBLE
  +  OBSOLETO
  +  PRESTADO
  + valueOf(String) Estado
  + values() Estado[]
}
class FieldError {
  - String errorCode
  - String field
  + getErrorCode() String
  + getField() String
  + setErrorCode(String) void
  + setField(String) void
}
class HomeController {
  + index() String
}
class HtmxErrorController {
  - BasicErrorController basicErrorController
  + errorHtmx(HttpServletRequest, HttpServletResponse) ModelAndView
}
class JacksonConfig {
  + jacksonCustomizer() Jackson2ObjectMapperBuilderCustomizer
}
class Lector {
  - String apellido
  - OffsetDateTime dateCreated
  - String dni
  - Long id
  - OffsetDateTime lastUpdated
  - Set~Prestamo~ lectorPrestamoes
  - String nombre
  + getApellido() String
  + getDateCreated() OffsetDateTime
  + getDni() String
  + getId() Long
  + getLastUpdated() OffsetDateTime
  + getLectorPrestamoes() Set~Prestamo~
  + getNombre() String
  + setApellido(String) void
  + setDateCreated(OffsetDateTime) void
  + setDni(String) void
  + setId(Long) void
  + setLastUpdated(OffsetDateTime) void
  + setLectorPrestamoes(Set~Prestamo~) void
  + setNombre(String) void
}
class LectorController {
  - LectorService lectorService
  + add(LectorDTO) String
  + add(LectorDTO, BindingResult, RedirectAttributes) String
  + delete(Long, RedirectAttributes) String
  + edit(Long, Model) String
  + edit(Long, LectorDTO, BindingResult, RedirectAttributes) String
  + list(Model) String
}
class LectorDTO {
  - String apellido
  - String dni
  - Long id
  - String nombre
  + getApellido() String
  + getDni() String
  + getId() Long
  + getNombre() String
  + setApellido(String) void
  + setDni(String) void
  + setId(Long) void
  + setNombre(String) void
}
class LectorRepository {
<<Interface>>

}
class LectorResource {
  - LectorService lectorService
  + createLector(LectorDTO) ResponseEntity~Long~
  + deleteLector(Long) ResponseEntity~Void~
  + getAllLectors() ResponseEntity~List~LectorDTO~~
  + getLector(Long) ResponseEntity~LectorDTO~
  + updateLector(Long, LectorDTO) ResponseEntity~Long~
}
class LectorService {
  - BibliotecarioRepository bibliotecarioRepository
  - LectorRepository lectorRepository
  - PrestamoRepository prestamoRepository
  + create(LectorDTO) Long
  + delete(Long) void
  + findAll() List~LectorDTO~
  + get(Long) LectorDTO
  + getReferencedWarning(Long) String
  - mapToDTO(Lector, LectorDTO) LectorDTO
  - mapToEntity(LectorDTO, Lector) Lector
  + update(Long, LectorDTO) void
}
class Libro {
  - String autor
  - OffsetDateTime dateCreated
  - Estado estado
  - Long id
  - OffsetDateTime lastUpdated
  - Set~Prestamo~ libroPrestamoes
  - String titulo
  + getAutor() String
  + getDateCreated() OffsetDateTime
  + getEstado() Estado
  + getId() Long
  + getLastUpdated() OffsetDateTime
  + getLibroPrestamoes() Set~Prestamo~
  + getTitulo() String
  + setAutor(String) void
  + setDateCreated(OffsetDateTime) void
  + setEstado(Estado) void
  + setId(Long) void
  + setLastUpdated(OffsetDateTime) void
  + setLibroPrestamoes(Set~Prestamo~) void
  + setTitulo(String) void
}
class LibroController {
  - LibroService libroService
  + add(LibroDTO, BindingResult, RedirectAttributes) String
  + add(LibroDTO) String
  + delete(Long, RedirectAttributes) String
  + edit(Long, LibroDTO, BindingResult, RedirectAttributes) String
  + edit(Long, Model) String
  + list(Model) String
  + prepareContext(Model) void
}
class LibroDTO {
  - String autor
  - Estado estado
  - Long id
  - String titulo
  + getAutor() String
  + getEstado() Estado
  + getId() Long
  + getTitulo() String
  + setAutor(String) void
  + setEstado(Estado) void
  + setId(Long) void
  + setTitulo(String) void
}
class LibroRepository {
<<Interface>>

}
class LibroResource {
  - LibroService libroService
  + createLibro(LibroDTO) ResponseEntity~Long~
  + deleteLibro(Long) ResponseEntity~Void~
  + getAllLibros() ResponseEntity~List~LibroDTO~~
  + getLibro(Long) ResponseEntity~LibroDTO~
  + updateLibro(Long, LibroDTO) ResponseEntity~Long~
}
class LibroService {
  - LibroRepository libroRepository
  - PrestamoRepository prestamoRepository
  + create(LibroDTO) Long
  + delete(Long) void
  + findAll() List~LibroDTO~
  + get(Long) LibroDTO
  + getReferencedWarning(Long) String
  - mapToDTO(Libro, LibroDTO) LibroDTO
  - mapToEntity(LibroDTO, Libro) Libro
  + update(Long, LibroDTO) void
}
class LocalDevConfig
class NotFoundException
class Prestamo {
  - Bibliotecario bibliotecario
  - OffsetDateTime dateCreated
  - LocalDate fechaDevolucion
  - LocalDate fechaPrestamo
  - Long id
  - OffsetDateTime lastUpdated
  - Lector lector
  - Libro libro
  + getBibliotecario() Bibliotecario
  + getDateCreated() OffsetDateTime
  + getFechaDevolucion() LocalDate
  + getFechaPrestamo() LocalDate
  + getId() Long
  + getLastUpdated() OffsetDateTime
  + getLector() Lector
  + getLibro() Libro
  + setBibliotecario(Bibliotecario) void
  + setDateCreated(OffsetDateTime) void
  + setFechaDevolucion(LocalDate) void
  + setFechaPrestamo(LocalDate) void
  + setId(Long) void
  + setLastUpdated(OffsetDateTime) void
  + setLector(Lector) void
  + setLibro(Libro) void
}
class PrestamoController {
  - BibliotecarioRepository bibliotecarioRepository
  - LectorRepository lectorRepository
  - LibroRepository libroRepository
  - PrestamoService prestamoService
  + add(PrestamoDTO) String
  + add(PrestamoDTO, BindingResult, RedirectAttributes) String
  + delete(Long, RedirectAttributes) String
  + edit(Long, PrestamoDTO, BindingResult, RedirectAttributes) String
  + edit(Long, Model) String
  + list(Model) String
  + prepareContext(Model) void
}
class PrestamoDTO {
  - Long bibliotecario
  - LocalDate fechaDevolucion
  - LocalDate fechaPrestamo
  - Long id
  - Long lector
  - Long libro
  + getBibliotecario() Long
  + getFechaDevolucion() LocalDate
  + getFechaPrestamo() LocalDate
  + getId() Long
  + getLector() Long
  + getLibro() Long
  + setBibliotecario(Long) void
  + setFechaDevolucion(LocalDate) void
  + setFechaPrestamo(LocalDate) void
  + setId(Long) void
  + setLector(Long) void
  + setLibro(Long) void
}
class PrestamoRepository {
<<Interface>>
  + findFirstByBibliotecario(Bibliotecario) Prestamo
  + findFirstByLector(Lector) Prestamo
  + findFirstByLibro(Libro) Prestamo
}
class PrestamoResource {
  - PrestamoService prestamoService
  + createPrestamo(PrestamoDTO) ResponseEntity~Long~
  + deletePrestamo(Long) ResponseEntity~Void~
  + getAllPrestamos() ResponseEntity~List~PrestamoDTO~~
  + getPrestamo(Long) ResponseEntity~PrestamoDTO~
  + updatePrestamo(Long, PrestamoDTO) ResponseEntity~Long~
}
class PrestamoService {
  - BibliotecarioRepository bibliotecarioRepository
  - LectorRepository lectorRepository
  - LibroRepository libroRepository
  - PrestamoRepository prestamoRepository
  + create(PrestamoDTO) Long
  + delete(Long) void
  + findAll() List~PrestamoDTO~
  + get(Long) PrestamoDTO
  - mapToDTO(Prestamo, PrestamoDTO) PrestamoDTO
  - mapToEntity(PrestamoDTO, Prestamo) Prestamo
  + update(Long, PrestamoDTO) void
}
class RestExceptionHandler {
  + handleMethodArgumentNotValid(MethodArgumentNotValidException) ResponseEntity~ErrorResponse~
  + handleNotFound(NotFoundException) ResponseEntity~ErrorResponse~
  + handleResponseStatus(ResponseStatusException) ResponseEntity~ErrorResponse~
  + handleThrowable(Throwable) ResponseEntity~ErrorResponse~
}
class WebAdvice {
  + getIsDevserver(HttpServletRequest) Boolean
  + getRequestUri(HttpServletRequest) String
}
class WebUtils {
  + String MSG_ERROR
  + String MSG_INFO
  + String MSG_SUCCESS
  - LocaleResolver localeResolver
  - MessageSource messageSource
  + getMessage(String, Object[]) String
  + getRequest() HttpServletRequest
  + isRequiredField(Object, String) boolean
}

