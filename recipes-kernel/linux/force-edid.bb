SRC_URI += "file://monitor.edid"

LICENSE = "CLOSED"

do_install () {
    install -d ${D}/usr/lib/firmware/edid
    install -m 0644  ${WORKDIR}/monitor.edid ${D}/usr/lib/firmware/edid/monitor.edid
}

FILES:${PN} += "/usr/lib/firmware/edid/monitor.edid"

