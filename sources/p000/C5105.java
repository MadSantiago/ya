package p000;

import java.util.Objects;

/* JADX INFO: renamed from: ۦۙؔٙٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5105 implements Comparable {

    /* JADX INFO: renamed from: ۥَ */
    public final Object f16943;

    /* JADX INFO: renamed from: ۥْ */
    public final int f16944;

    /* JADX INFO: renamed from: ۥٓ */
    public final long f16945;

    /* JADX INFO: renamed from: ۥٖ */
    public final RuntimeException f16946;

    /* JADX INFO: renamed from: ۦ۟ */
    public final String f16947;

    /* JADX INFO: renamed from: ۦۨ */
    public final long f16948;

    public C5105(long j, String str, int i, long j2, Object obj) {
        AbstractC0949.m1941(((j > 0L ? 1 : (j == 0L ? 0 : -1)) == 0) == (str != null));
        this.f16948 = j;
        this.f16947 = str;
        this.f16944 = i;
        this.f16945 = j2;
        this.f16943 = obj;
        if (i != 5) {
            this.f16946 = null;
            return;
        }
        if (obj == null) {
            this.f16946 = new NullPointerException("Null stringOrBytes");
        } else if ((obj instanceof byte[]) || (obj instanceof AbstractC4314)) {
            this.f16946 = null;
        } else {
            this.f16946 = new RuntimeException("Wrong stringOrBytes type: ".concat(String.valueOf(obj.getClass())));
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C5105 c5105 = (C5105) obj;
        long j = c5105.f16948;
        long j2 = this.f16948;
        int iCompare = Long.compare(j2, j);
        if (iCompare != 0) {
            return iCompare;
        }
        if (j2 != 0) {
            return 0;
        }
        String str = this.f16947;
        str.getClass();
        String str2 = c5105.f16947;
        str2.getClass();
        return str.compareTo(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5105)) {
            return false;
        }
        C5105 c5105 = (C5105) obj;
        return this.f16948 == c5105.f16948 && Objects.equals(this.f16947, c5105.f16947);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f16948), this.f16947);
    }

    public final String toString() {
        String string = this.f16947;
        if (string == null) {
            string = Long.toString(this.f16948);
        }
        String strValueOf = String.valueOf(m8737());
        return AbstractC3761.m6622(new StringBuilder(String.valueOf(string).length() + 1 + strValueOf.length()), string, ":", strValueOf);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final Object m8737() {
        int i = this.f16944;
        if (i == 0) {
            return Boolean.FALSE;
        }
        if (i == 1) {
            return Boolean.TRUE;
        }
        long j = this.f16945;
        if (i == 2) {
            return Long.valueOf(j);
        }
        if (i == 3) {
            return Double.valueOf(Double.longBitsToDouble(j));
        }
        Object obj = this.f16943;
        if (i == 4) {
            obj.getClass();
            return obj;
        }
        if (i != 5) {
            throw new AssertionError("Impossible, this was validated when parsed or created");
        }
        obj.getClass();
        try {
            return obj instanceof byte[] ? (byte[]) obj : ((AbstractC4314) obj).m7608();
        } catch (Throwable th) {
            RuntimeException runtimeException = this.f16946;
            if (runtimeException != null) {
                th.addSuppressed(runtimeException);
            }
            throw th;
        }
    }
}
