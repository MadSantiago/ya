package p000;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Formattable;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: ۦؑؕۤٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3043 {

    /* JADX INFO: renamed from: ۥؗ */
    public int f10231;

    /* JADX INFO: renamed from: ۥُ */
    public final Object f10232;

    /* JADX INFO: renamed from: ۥّ */
    public final Object f10233;

    /* JADX INFO: renamed from: ۥۗ */
    public int f10234;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f10235;

    /* JADX INFO: renamed from: ۦؑ */
    public int f10236;

    /* JADX INFO: renamed from: ۦۙ */
    public Object f10237;

    public C3043(C4407 c4407, Object[] objArr, StringBuilder sb) {
        this.f10235 = 1;
        this.f10234 = 0;
        this.f10231 = -1;
        AbstractC3933.m7065(c4407, "context");
        this.f10232 = c4407;
        this.f10236 = 0;
        this.f10233 = objArr;
        this.f10237 = sb;
    }

    /* JADX INFO: renamed from: ۥّ */
    public static void m5645(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(AbstractC4935.m8328(obj));
        sb.append("]");
    }

    public String toString() {
        switch (this.f10235) {
            case 0:
                StringBuilder sb = new StringBuilder("digraph {\n");
                m5650((C2991) this.f10233, sb);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x012a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0130  */
    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Code duplicated, block: B:64:0x0092  */
    /* JADX INFO: renamed from: ۥؗ */
    public void m5646(Object obj, EnumC2571 enumC2571, C0562 c0562) {
        String simpleName;
        C0562 c0563;
        boolean zIsValidCodePoint;
        StringBuilder sb = (StringBuilder) this.f10237;
        int i = enumC2571.f8587;
        String string = enumC2571.f8586;
        int iM6632 = AbstractC3761.m6632(i);
        if (iM6632 != 0) {
            if (iM6632 == 1) {
                zIsValidCodePoint = obj instanceof Boolean;
            } else if (iM6632 != 2) {
                if (iM6632 != 3) {
                    if (iM6632 != 4) {
                        throw null;
                    }
                    if ((obj instanceof Double) || (obj instanceof Float) || (obj instanceof BigDecimal)) {
                        zIsValidCodePoint = true;
                    } else {
                        zIsValidCodePoint = false;
                    }
                } else if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof BigInteger)) {
                    zIsValidCodePoint = true;
                } else {
                    zIsValidCodePoint = false;
                }
            } else if (obj instanceof Character) {
                zIsValidCodePoint = true;
            } else if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                zIsValidCodePoint = Character.isValidCodePoint(((Number) obj).intValue());
            } else {
                zIsValidCodePoint = false;
            }
            if (!zIsValidCodePoint) {
                m5645(sb, obj, string);
                return;
            }
        }
        int iOrdinal = enumC2571.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                if (c0562.m1263()) {
                    sb.append(obj);
                    return;
                }
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal == 5) {
                        if (c0562.m1263()) {
                            c0563 = c0562;
                        } else {
                            int i2 = c0562.f2009;
                            int i3 = i2 & 128;
                            if (i3 == 0) {
                                c0563 = C0562.f2005;
                            } else if (i3 == i2 && c0562.f2008 == -1 && c0562.f2007 == -1) {
                                c0563 = c0562;
                            } else {
                                c0563 = new C0562(i3, -1, -1);
                            }
                        }
                        if (c0563.equals(c0562)) {
                            Number number = (Number) obj;
                            Locale locale = AbstractC4935.f16254;
                            boolean zM1261 = c0562.m1261();
                            long jLongValue = number.longValue();
                            if (number instanceof Long) {
                                AbstractC4935.m8327(sb, jLongValue, zM1261);
                                return;
                            }
                            if (number instanceof Integer) {
                                AbstractC4935.m8327(sb, jLongValue & 4294967295L, zM1261);
                                return;
                            }
                            if (number instanceof Byte) {
                                AbstractC4935.m8327(sb, jLongValue & 255, zM1261);
                                return;
                            }
                            if (number instanceof Short) {
                                AbstractC4935.m8327(sb, jLongValue & 65535, zM1261);
                                return;
                            }
                            if (!(number instanceof BigInteger)) {
                                C1078.m2276("unsupported number type: ".concat(String.valueOf(number.getClass())));
                                return;
                            }
                            String string2 = ((BigInteger) number).toString(16);
                            if (zM1261) {
                                string2 = string2.toUpperCase(AbstractC4935.f16254);
                            }
                            sb.append(string2);
                            return;
                        }
                    }
                } else if (c0562.m1263()) {
                    sb.append(obj);
                    return;
                }
            } else if (c0562.m1263()) {
                if (obj instanceof Character) {
                    sb.append(obj);
                    return;
                }
                int iIntValue = ((Number) obj).intValue();
                if ((iIntValue >>> 16) == 0) {
                    sb.append((char) iIntValue);
                    return;
                } else {
                    sb.append(Character.toChars(iIntValue));
                    return;
                }
            }
        } else {
            if (obj instanceof Formattable) {
                Formattable formattable = (Formattable) obj;
                Locale locale2 = AbstractC4935.f16254;
                int i4 = c0562.f2009;
                int i5 = i4 & 162;
                if (i5 != 0) {
                    i5 = ((i4 & 32) == 0 ? 0 : 1) | ((i4 & 128) != 0 ? 2 : 0) | ((i4 & 2) == 0 ? 0 : 4);
                }
                int length = sb.length();
                Formatter formatter = new Formatter(sb, AbstractC4935.f16254);
                try {
                    formattable.formatTo(formatter, i5, c0562.f2008, c0562.f2007);
                    return;
                } catch (RuntimeException e) {
                    sb.setLength(length);
                    try {
                        Appendable appendableOut = formatter.out();
                        try {
                            simpleName = e.toString();
                        } catch (RuntimeException e2) {
                            simpleName = e2.getClass().getSimpleName();
                        }
                        appendableOut.append(AbstractC4935.m8326(formattable, simpleName));
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            }
            if (c0562.m1263()) {
                sb.append(AbstractC4935.m8328(obj));
                return;
            }
        }
        if (!c0562.m1263()) {
            int i6 = enumC2571.f8588;
            if (c0562.m1261()) {
                i6 &= 65503;
            }
            StringBuilder sb2 = new StringBuilder("%");
            c0562.m1264(sb2);
            sb2.append((char) i6);
            string = sb2.toString();
        }
        sb.append(String.format(AbstractC4935.f16254, string, obj));
    }

    /* JADX INFO: renamed from: ۥُ */
    public boolean m5647(int i, int i2, int i3, int i4) {
        if (i < 0 || i3 < 0) {
            return false;
        }
        int[] iArr = (int[]) this.f10232;
        int length = iArr.length;
        int iMin = Math.min(length, i2);
        if (iMin - i != Math.min(length, i4) - i3) {
            return false;
        }
        for (int i5 = i; i5 <= iMin; i5++) {
            if (iArr[i5] != iArr[(i3 + i5) - i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public void m5648() {
        C2991 c2991 = ((C2991) this.f10237).f10057;
        if (c2991 != null) {
            this.f10237 = c2991;
        } else {
            this.f10237 = (C2991) this.f10233;
            int i = this.f10231;
            if (i > 0) {
                this.f10231 = i - 1;
            }
            if (this.f10236 > 0) {
                this.f10234++;
            }
        }
        m5649();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public void m5649() {
        if (this.f10231 == 0) {
            return;
        }
        HashMap map = ((C2991) this.f10237).f10060;
        int[] iArr = (int[]) this.f10232;
        C2991 c2991 = (C2991) map.get(Integer.valueOf(iArr[this.f10234]));
        while (true) {
            int i = (c2991.f10058 - c2991.f10059) + 1;
            int i2 = this.f10231;
            if (i > i2) {
                return;
            }
            int i3 = this.f10234 + i;
            this.f10234 = i3;
            this.f10237 = c2991;
            int i4 = i2 - i;
            this.f10231 = i4;
            if (i4 > 0) {
                c2991 = (C2991) c2991.f10060.get(Integer.valueOf(iArr[i3]));
            }
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public void m5650(C2991 c2991, StringBuilder sb) {
        for (C2991 c2992 : c2991.f10060.values()) {
            sb.append("  ");
            sb.append(c2991);
            sb.append(" -> ");
            sb.append(c2992);
            sb.append(" [label=\"");
            int[] iArr = (int[]) this.f10232;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, c2992.f10059, Math.min(iArr.length, c2992.f10058 + 1))));
            sb.append("\"]\n");
            m5650(c2992, sb);
        }
    }

    public C3043(int[] iArr) {
        this.f10235 = 0;
        this.f10232 = iArr;
        C2991 c2991 = new C2991(-1, -1);
        this.f10233 = c2991;
        this.f10237 = c2991;
    }
}
