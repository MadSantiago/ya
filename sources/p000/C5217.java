package p000;

/* JADX INFO: renamed from: ۦۛؒٔؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5217 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C3262 f17231;

    public /* synthetic */ C5217(C3262 c3262) {
        this.f17231 = c3262;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final Object m8836(C3262 c3262) {
        Object objM6027 = c3262.m6027(null);
        if (objM6027 == null) {
            return null;
        }
        if (!(objM6027 instanceof C2730)) {
            c3262.m6026(null);
            return objM6027;
        }
        C2730 c2730 = (C2730) objM6027;
        if (c2730.m5078()) {
            C0178.m384("List is empty.");
            return null;
        }
        int i = c2730.f9040 - 1;
        Object objM5076 = c2730.m5076(i);
        c2730.m5085(i);
        if (c2730.m5078()) {
            c3262.m6026(null);
        }
        if (c2730.f9040 == 1) {
            c3262.m6023(null, c2730.m5075());
        }
        return objM5076;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5217) {
            return this.f17231.equals(((C5217) obj).f17231);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17231.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.f17231 + ')';
    }
}
