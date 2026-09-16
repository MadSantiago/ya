package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ۥٜؖ۟ۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1838 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final /* synthetic */ int f6108 = 0;

    /* JADX INFO: renamed from: ۥۗ */
    public boolean f6109;

    /* JADX INFO: renamed from: ۥۣ */
    public final C1789 f6110 = new C1789();

    static {
        new C1838(0);
    }

    public C1838(int i) {
        m3613();
        m3613();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static void m3612(AbstractC0438 abstractC0438, EnumC4646 enumC4646, int i, Object obj) {
        if (enumC4646 == EnumC4646.f15325) {
            abstractC0438.mo944(i, 3);
            ((AbstractC5212) ((AbstractC3127) obj)).m8827(abstractC0438);
            abstractC0438.mo944(i, 4);
            return;
        }
        abstractC0438.mo944(i, enumC4646.f15327);
        EnumC3135 enumC3135 = EnumC3135.f10563;
        switch (enumC4646.ordinal()) {
            case 0:
                abstractC0438.mo948(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                abstractC0438.mo937(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                abstractC0438.mo942(((Long) obj).longValue());
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                abstractC0438.mo942(((Long) obj).longValue());
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                abstractC0438.mo940(((Integer) obj).intValue());
                break;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                abstractC0438.mo948(((Long) obj).longValue());
                break;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                abstractC0438.mo937(((Integer) obj).intValue());
                break;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                abstractC0438.mo954(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof AbstractC4314)) {
                    abstractC0438.mo953((String) obj);
                } else {
                    abstractC0438.mo946((AbstractC4314) obj);
                }
                break;
            case 9:
                ((AbstractC5212) ((AbstractC3127) obj)).m8827(abstractC0438);
                break;
            case 10:
                abstractC0438.mo955((AbstractC3127) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC4314)) {
                    byte[] bArr = (byte[]) obj;
                    abstractC0438.mo952(bArr.length, bArr);
                } else {
                    abstractC0438.mo946((AbstractC4314) obj);
                }
                break;
            case 12:
                abstractC0438.mo941(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof InterfaceC3120)) {
                    abstractC0438.mo940(((Integer) obj).intValue());
                } else {
                    abstractC0438.mo940(((InterfaceC3120) obj).mo1880());
                }
                break;
            case 14:
                abstractC0438.mo937(((Integer) obj).intValue());
                break;
            case 15:
                abstractC0438.mo948(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                abstractC0438.mo941((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                abstractC0438.mo942((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public final Object clone() {
        C1838 c1838 = new C1838();
        C1789 c1789 = this.f6110;
        if (c1789.f5987 > 0) {
            c1789.m3575(0).f10853.getClass();
            C0178.m382();
            return null;
        }
        Iterator it = c1789.m3574().iterator();
        if (!it.hasNext()) {
            return c1838;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            C0178.m382();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1838) {
            return this.f6110.equals(((C1838) obj).f6110);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6110.hashCode();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m3613() {
        if (this.f6109) {
            return;
        }
        C1789 c1789 = this.f6110;
        int i = c1789.f5987;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = c1789.m3575(i2).f10852;
            if (obj instanceof AbstractC5212) {
                AbstractC5212 abstractC5212 = (AbstractC5212) obj;
                C4946.f16366.m8330(abstractC5212.getClass()).mo1654(abstractC5212);
                abstractC5212.m8825();
            }
        }
        Iterator it = c1789.m3574().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof AbstractC5212) {
                AbstractC5212 abstractC5213 = (AbstractC5212) value;
                C4946.f16366.m8330(abstractC5213.getClass()).mo1654(abstractC5213);
                abstractC5213.m8825();
            }
        }
        if (!c1789.f5985) {
            if (c1789.f5987 > 0) {
                c1789.m3575(0).f10853.getClass();
                C0178.m382();
                return;
            } else {
                Iterator it2 = c1789.m3574().iterator();
                if (it2.hasNext()) {
                    ((Map.Entry) it2.next()).getKey().getClass();
                    C0178.m382();
                    return;
                }
            }
        }
        if (!c1789.f5985) {
            c1789.f5984 = c1789.f5984.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(c1789.f5984);
            c1789.f5986 = c1789.f5986.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(c1789.f5986);
            c1789.f5985 = true;
        }
        this.f6109 = true;
    }

    public C1838() {
    }
}
