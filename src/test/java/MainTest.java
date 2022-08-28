import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest extends WebDriverManagerConfig {

    private static final String SII_PORTAL = "https://siiportal.sii.pl/Warszawa/SitePages/Home.aspx#/";
    private static final String ONET = "https://www.onet.pl/";
    private static final String KOTUSZKOWO = "http://kotuszkowo.pl/";
    private static final String FILMWEB = "https://www.filmweb.pl/";
    private static final String SELENIUM_DOC = "https://www.selenium.dev/documentation/webdriver/";

    private static final Logger log = LoggerFactory.getLogger(MainTest.class);

    @Tag("regresja")
    @Tag("sii")
    @ParameterizedTest
    @ValueSource(strings = {"Logowanie na koncie"})
    @DisplayName("Sprawdzenie nazwy strony Sii Portal")
    void checkTitleForSiiWebsite(String expectedTitle) {

        driver.get(SII_PORTAL);
        log.info("Została otworzona strona " + SII_PORTAL);
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();
        log.info("Pobrany tytuł ze strony: " + actualTitle);

        assertThat(actualTitle).isEqualTo(expectedTitle);

    }

    @Tag("regresja")
    @Tag("onet")
    @ParameterizedTest
    @ValueSource(strings = {"Onet – Jesteś na bieżąco"})
    @DisplayName("Sprawdzenie nazwy strony Onet")
    void checkTitleForOnetWebsite(String expectedTitle) {

        driver.get(ONET);
        log.info("Została otworzona strona " + ONET);
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();

        assertThat(actualTitle).isEqualTo(expectedTitle);
        log.info("Tytuł otwartej strony: " + actualTitle + " | Oczekiwany tytuł: " + expectedTitle);
    }

    @Tag("regresja")
    @Tag("kotuszkowo")
    @ParameterizedTest
    @ValueSource(strings = {"Kotuszkowo- blog o kotach"})
    @DisplayName("Sprawdzenie nazwy strony Kotuszkowo")
    void checkTitleForKotuszkowoWebsite(String expectedTitle) {

        driver.get(KOTUSZKOWO);
        log.info("Została otworzona strona " + KOTUSZKOWO);
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();

        assertThat(actualTitle).isEqualTo(expectedTitle);
        log.info("Tytuł otwartej strony: " + actualTitle + " | Oczekiwany tytuł: " + expectedTitle);
    }

    @Tag("regresja")
    @Tag("filmweb")
    @ParameterizedTest
    @ValueSource(strings = {"Filmweb - filmy takie jak Ty!"})
    @DisplayName("Sprawdzenie nazwy strony FilmWeb")
    void checkTitleForFilmwebWebsite(String expectedTitle) {

        driver.get(FILMWEB);
        log.info("Została otworzona strona " + FILMWEB);
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();

        assertThat(actualTitle).isEqualTo(expectedTitle);
        log.info("Tytuł otwartej strony: " + actualTitle + " | Oczekiwany tytuł: " + expectedTitle);
    }

    @Tag("regresja")
    @Tag("selenium")
    @ParameterizedTest
    @ValueSource(strings = {"WebDriver | Selenium"})
    @DisplayName("Sprawdzenie nazwy strony Seleniuj")
    void checkTitleForSeleniumWebsite(String expectedTitle) {

        driver.get(SELENIUM_DOC);
        log.info("Została otworzona strona " + SELENIUM_DOC);
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();

        assertThat(actualTitle).isEqualTo(expectedTitle);
        log.info("Tytuł otwartej strony: " + actualTitle + " | Oczekiwany tytuł: " + expectedTitle);
    }
}
