package p000;

import java.io.IOException;

/* JADX INFO: renamed from: ۦؗؒٛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C3406 extends IOException {

    /* JADX INFO: renamed from: ۦۨ */
    public boolean f11336;

    /* JADX INFO: renamed from: ۥؗ */
    public static C3406 m6168() {
        return new C3406("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: ۥُ */
    public static C3406 m6169() {
        return new C3406("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static C1423 m6170() {
        return new C1423("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C3406 m6171() {
        return new C3406("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static C3406 m6172() {
        return new C3406("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
}
