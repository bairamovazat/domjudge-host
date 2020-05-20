package ru.ivmiit.domjudge.connector.utils;

import java.util.HashMap;

public class ExecutablesInMemoryUtils {

    public static HashMap<String, String> getExecutables() {
        HashMap<String, String> executables = new HashMap<>();
        executables.put("compare", "\"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\"");

        executables.put("java_javac", "\"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\"");

        executables.put("java_javac_detect", "\"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\"");

        executables.put("pas", "\"UEsDBAoAAAAAACsFoVDQhZX8HwAAAB8AAAAFABwAYnVpbGRVVAkAAwJGq14CRqtedXgLAAEE6AMAAAToAwAAIyEvYmluL3NoCiMgbm90aGluZyB0byBjb21waWxlClBLAwQUAAAACAArBaFQQvgADjgDAADRBQAAAwAcAHJ1blVUCQADAkarXgJGq151eAsAAQToAwAABOgDAACNVN9z2zYMfhb/Cszx1fFiKT/eppzXZbPb8y62e3G8dkuzHC1BMheK1JFUXPevHygps9y+TE8CCXwAPn7AyQ/nG6HO7ZaxE/hgecIlJLoohUTYGV6WaEKbGFE6yLSBQXsX2e0googVIrgtd9DxsXvl+BfgKoVCGwShMh0xNpmu7se9/mUPrsFuRebYfDq/nc1n357ezBar5frut2l9zpjI4AFCBb3+dHF/9+fTh+Vscd+Dx2vKjIoFRwFdF4bSIgtO4F2ZgFZyDzxJsHQWOFihcmrR6sokCBm1NKor3gkpIUWHiavttl+PUinh6KpElaJKBFoQzqLMIrhFN7DgzB6cBl453QJQfVBwoaA0Oje8iFiwWM+bWlfjCxZ4ugQRRL394hlINQu6Lv3T04N1djkc0jXRkRssIZzC4O+Hh9iWPMH48fHHNknn6OzhJvyLh1+fLsKfHs9Ou86fj6wjv+7F6H95fR4O33bt6wE1JHrw83mKL+eqIkpfHysI3i3Xi8nY35OVCRakWhG/9Sv3D93CGC4Pbxw4UyGQ3p5FSUfCQsItEp8oD/KokTvCCNrzyfTX9Xs6hzdvAJOtht4EN1UeQ+VVAIMmcADcHr1WrYrIV3mksCaLz+zFFTSAH7lRhBWTXiqZgtKuFpEphMLvQUf/ZT4gD3wmosMr7Q5LbRr5oPKyKrVQbkRqJclR5wo2JF3+gukIMMqjeuwkp3xAypB8H7O2rhnNXtzqGdMG7alGi6GTvMd85hO4SVMI0+XidraYPv2+nryfkjlZzpvfDUq9A+J7ryvYceV8NQV/piq5FZTcl+GQFzQLmtBSDVL7hZJ6unPqOPJJwhexUzHQ9weajba0aBr27MgTR3PlB89vDVNwJ7QihAKt5TlaH35xVQcDjd0LSrgCXTpRiK+1r4XTFDNeyXYXlYjp0Eet8jZqVZU1u5JTP3WqXNPY0qAXZFB83cW2rosoVATg+7wOa5hPq1cYR/kSkEI909JwW+Ckcik2hhtaDSyjlVM3CuHyymf3oRBqr8YVba/eEfv4RbiEtsa4/9YzlEikN04Mcv9oevOPXyZeODZmpoAwgwYm0rQefSz0XxHYv1BLAQIeAwoAAAAAACsFoVDQhZX8HwAAAB8AAAAFABgAAAAAAAEAAADtgQAAAABidWlsZFVUBQADAkarXnV4CwABBOgDAAAE6AMAAFBLAQIeAxQAAAAIACsFoVBC+AAOOAMAANEFAAADABgAAAAAAAEAAADtgV4AAABydW5VVAUAAwJGq151eAsAAQToAwAABOgDAABQSwUGAAAAAAIAAgCUAAAA0wMAAAAA\"");

        executables.put("run", "\"UEsDBAoAAAAAACsFoVDQhZX8HwAAAB8AAAAFABwAYnVpbGRVVAkAAwJGq14CRqtedXgLAAEE6AMAAAToAwAAIyEvYmluL3NoCiMgbm90aGluZyB0byBjb21waWxlClBLAwQUAAAACAArBaFQR2jgfiQBAADgAQAAAwAcAHJ1blVUCQADAkarXgJGq151eAsAAQToAwAABOgDAABNkE9PwzAMxe/5FKabtAvr4AplQkKAuGxof85T1rltpDYOiaPt4+PQiC1SFCv5Pfu9TO4WR2MXoVNqApto4ey1c+jnofbGMdS67/EEjacBZoyBax3w4KMtQzcrRbNFBO40QxY05GEgj2BsQwIIsg+6xSeYPkCVOhi7hMp5ailyrrwelmU50v+MrA/TI9RkWRtrbAvpaW6si5xGX5tk8tyhDGaSEIYRAvWRDVkQ5laSponkjYZB2xOkTS6BAaiRMAiZSq2OCCmtUrv37e5r9VJMH4tngNCZhtX3Zv253u/y5XiX//G2zblL7jyejMeaU5C/DIurrxVx/sZi+loAXpy4Cml+QKe9ZryHnyiQ2PVtHNByKBVesB4FlRyjwQKWUmdjhfoFUEsBAh4DCgAAAAAAKwWhUNCFlfwfAAAAHwAAAAUAGAAAAAAAAQAAAO2BAAAAAGJ1aWxkVVQFAAMCRqtedXgLAAEE6AMAAAToAwAAUEsBAh4DFAAAAAgAKwWhUEdo4H4kAQAA4AEAAAMAGAAAAAAAAQAAAO2BXgAAAHJ1blVUBQADAkarXnV4CwABBOgDAAAE6AMAAFBLBQYAAAAAAgACAJQAAAC/AQAAAAA=\"");

        executables.put("sh", "\"UEsDBAoAAAAAACsFoVDQhZX8HwAAAB8AAAAFABwAYnVpbGRVVAkAAwJGq14CRqtedXgLAAEE6AMAAAToAwAAIyEvYmluL3NoCiMgbm90aGluZyB0byBjb21waWxlClBLAwQUAAAACAArBaFQOtndLscCAADDBAAAAwAcAHJ1blVUCQADAkarXgJGq151eAsAAQToAwAABOgDAABdVGFP2zAQ/Vz/isPtQNpKga+FbqA2Q5mgQbRoTAwhN7k2Fqkd2Q7QIf777tIUKr5Eyd353bt3z2nvHMy0OfC5EG24SibxLfgciwJSuyx1gfDsVFmi2/ep02WAuXWw1+R6Pt/r0bEJIoRcBdiq8SsT1Asok8HSOgRt5pZqqXqaa7+pzCx6MDaASkOlimIFssGWhIjgbeVS7MKsCkREB6pWBLFm2GDUnZ81BeaVSYO2BpSvT+MLplVQswL78JyjgZRaYNYFHQikPrIuwa1mFA95/Z1a5zANRD2gKx3SsxmrS/nKEwbh2WdtFvRNQ30UZhuwYGGGUHmKBKeMLxU9A81JFPW8IULvzdQZH1DgA+mmCmsQaDnKrXpCjKLJdCA7RxKOaX49D+IyuryIL+PP0bN4PElurocRxV+j8fT6z8NVEo+n/f3O0ZsU4vpmnFxN42Q8GUjJW7/G0rqwVswEt4LS0iRdGoH4kWaGR/DqiZXD3qJX77dQLIfDslCrvqBR7mD/H8jOVkMJ98eMakQL09yCjMkDfchIn5Qlqps91M360GHew4uzyUSKuWZawxzTx0bwvuCemhSmFqc8bGZFy+fQ+ZgG9jmppWhFt/F0mIyiQeeHaN0xqSYgqQbhEO5hd5dWT9O9p0RGanPb32yzxhe82bXL+iIll30nLN6DhJOTKPkp2u+Xpw3naNCpevXszs19oX1uPLZ27babyKprn/S486gWBjLtjFpifXXSXJkFcoiB6NQTiQZzvpd8a+a2oiJ0zjrfWy9B/u28Hn45+PomYWfAX4dba0izrXwj840h7y0Zlg1QaPYckqvZnitbkTspRUot1SPJorwm3ryMgGrpmVVmobB0swgrw1m1WJBq/FfAl9pWyfgiHkcPv25G59HgCEbJZfMqBAsDn5YoOx8Glsz2VAqWWqT50magvr1sdsDnideh+A9QSwECHgMKAAAAAAArBaFQ0IWV/B8AAAAfAAAABQAYAAAAAAABAAAA7YEAAAAAYnVpbGRVVAUAAwJGq151eAsAAQToAwAABOgDAABQSwECHgMUAAAACAArBaFQOtndLscCAADDBAAAAwAYAAAAAAABAAAA7YFeAAAAcnVuVVQFAAMCRqtedXgLAAEE6AMAAAToAwAAUEsFBgAAAAACAAIAlAAAAGIDAAAAAA==\"");

        return executables;
    }
}
