DESCRIPTION = "enigma2-plugin-extensions-yahooweather"
MAINTAINER = "original by m43c0 and mmark and mod by mogli123"
SECTION = "extra"
PRIORITY = "optional"

require conf/license/license-gplv2.inc

inherit gitpkgv
SRCREV = "${AUTOREV}"
PV = "1.2.+git${SRCPV}"
PKGV = "1.2.+git${GITPKGV}"
PR = "r0"


SRC_URI="git://github.com/XTAv2/YahooWeather.git"

S = "${WORKDIR}/git"

PACKAGES =+ "${PN}-src"
PACKAGES =+ "${PN}-po"
FILES_${PN}-src = "/usr/lib/enigma2/python/Plugins/Extensions/YahooWeather/*.py"
FILES_${PN}-po = "/usr/lib/enigma2/python/Plugins/Extensions/YahooWeather/locale/*/*/*.po"

inherit autotools

EXTRA_OECONF = "\
	--with-libsdl=no --with-boxtype=${MACHINE} --with-po \
	BUILD_SYS=${BUILD_SYS} \
	HOST_SYS=${HOST_SYS} \
	STAGING_INCDIR=${STAGING_INCDIR} \
	STAGING_LIBDIR=${STAGING_LIBDIR} \
"

pkg_postinst() {
#!/bin/sh 
echo ""
echo "YahooWeather successfully installed!"
echo ""
echo ""
exit 0
}

pkg_postrm() {
#!/bin/sh
rm -r /usr/lib/enigma2/python/Plugins/Extensions/YahooWeather
echo " YahooWeather removed! You should restart enigma2 now!"
exit 0
}
