package p000;

/* JADX INFO: renamed from: ۥۧؖٙٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2880 {
    /* JADX INFO: renamed from: ۥؖ */
    default float mo741(float f) {
        return mo746() * f;
    }

    /* JADX INFO: renamed from: ۥٌ */
    default long mo742(float f) {
        return mo745(mo753(f));
    }

    /* JADX INFO: renamed from: ۥٝ */
    default int mo743(float f) {
        float fMo741 = mo741(f);
        if (Float.isInfinite(fMo741)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fMo741);
    }

    /* JADX INFO: renamed from: ۥٞ */
    default float mo744(long j) {
        if (!C3970.m7128(C5023.m8439(j), 4294967296L)) {
            AbstractC1236.m2608("Only Sp can convert to Px");
        }
        return mo741(mo751(j));
    }

    /* JADX INFO: renamed from: ۥۖ */
    default long mo745(float f) {
        float[] fArr = AbstractC3232.f10856;
        if (mo754() < 1.03f) {
            return AbstractC4489.m7799(f / mo754(), 4294967296L);
        }
        InterfaceC4770 interfaceC4770M5956 = AbstractC3232.m5956(mo754());
        return AbstractC4489.m7799(interfaceC4770M5956 != null ? interfaceC4770M5956.mo1919(f) : f / mo754(), 4294967296L);
    }

    /* JADX INFO: renamed from: ۥۗ */
    float mo746();

    /* JADX INFO: renamed from: ۥۢ */
    default long mo747(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fMo741 = mo741(C1495.m3175(j));
        float fMo742 = mo741(C1495.m3176(j));
        return (((long) Float.floatToRawIntBits(fMo741)) << 32) | (((long) Float.floatToRawIntBits(fMo742)) & 4294967295L);
    }

    /* JADX INFO: renamed from: ۥۦ */
    default int mo749(long j) {
        return Math.round(mo744(j));
    }

    /* JADX INFO: renamed from: ۦُ */
    default float mo751(long j) {
        if (!C3970.m7128(C5023.m8439(j), 4294967296L)) {
            AbstractC1236.m2608("Only Sp can convert to Px");
        }
        float[] fArr = AbstractC3232.f10856;
        if (mo754() < 1.03f) {
            return mo754() * C5023.m8438(j);
        }
        InterfaceC4770 interfaceC4770M5956 = AbstractC3232.m5956(mo754());
        if (interfaceC4770M5956 != null) {
            return interfaceC4770M5956.mo1918(C5023.m8438(j));
        }
        return mo754() * C5023.m8438(j);
    }

    /* JADX INFO: renamed from: ۦٕ */
    default long mo752(long j) {
        if (j != 9205357640488583168L) {
            return AbstractC5568.m9370(mo753(Float.intBitsToFloat((int) (j >> 32))), mo753(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    /* JADX INFO: renamed from: ۦۖ */
    default float mo753(float f) {
        return f / mo746();
    }

    /* JADX INFO: renamed from: ۦۚ */
    float mo754();

    /* JADX INFO: renamed from: ۦۦ */
    default float mo756(int i) {
        return i / mo746();
    }
}
