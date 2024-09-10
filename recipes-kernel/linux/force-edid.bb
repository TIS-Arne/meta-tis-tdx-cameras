SRC_URI += "file://full-hd.edid"

LICENSE = "CLOSED"

do_install () {
    install -d ${D}/usr/lib/firmware/edid
    install -m 0644  ${WORKDIR}/full-hd.edid ${D}/usr/lib/firmware/edid/full-hd.edid
}

FILES:${PN} += "/usr/lib/firmware/edid/full-hd.edid"

