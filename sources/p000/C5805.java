package p000;

/* JADX INFO: renamed from: ۦؙٟۧؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5805 implements Comparable {

    /* JADX INFO: renamed from: ۦۨ */
    public final long f19129;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final C4036 f19128 = new C4036(6);

    /* JADX INFO: renamed from: ۥْ */
    public static final long f19126 = AbstractC4009.m7183(4611686018427387903L);

    /* JADX INFO: renamed from: ۥٓ */
    public static final long f19127 = AbstractC4009.m7183(-4611686018427387903L);

    /* JADX INFO: renamed from: ۥَ */
    public static final long f19125 = 9223372036854759646L;

    /* JADX INFO: renamed from: ۥؗ */
    public static int m9614(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return AbstractC3831.m6844(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return j < 0 ? -i : i;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final boolean m9615(long j) {
        return j == f19126 || j == f19127;
    }

    /* JADX INFO: renamed from: ۥّ */
    public static final long m9616(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? m9619(j >> 1, j2 >> 1) : m9619(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            if (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) {
                return AbstractC4009.m7183(j3 / 1000000);
            }
            long j4 = j3 << 1;
            int i2 = AbstractC4578.f15108;
            return j4;
        }
        long jM7155 = AbstractC4009.m7155(j >> 1, j2 >> 1);
        if (jM7155 == 9223372036854759646L) {
            C1078.m2272("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (jM7155 == 4611686018427387903L || jM7155 == -4611686018427387903L) {
            return AbstractC4009.m7183(jM7155);
        }
        if (-4611686018426L > jM7155 || jM7155 >= 4611686018427L) {
            return AbstractC4009.m7183(AbstractC4554.m7941(jM7155, -4611686018427387903L, 4611686018427387903L));
        }
        long j5 = (jM7155 * 1000000) << 1;
        int i3 = AbstractC4578.f15108;
        return j5;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final void m9617(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        CharSequence charSequenceSubSequence;
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strValueOf = String.valueOf(i2);
            if (i3 < 0) {
                C1078.m2272(AbstractC5078.m8681(i3, "Desired length ", " is less than zero."));
                return;
            }
            if (i3 <= strValueOf.length()) {
                charSequenceSubSequence = strValueOf.subSequence(0, strValueOf.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i3);
                int length = i3 - strValueOf.length();
                int i4 = 1;
                if (1 <= length) {
                    while (true) {
                        sb2.append('0');
                        if (i4 == length) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                sb2.append((CharSequence) strValueOf);
                charSequenceSubSequence = sb2;
            }
            String string = charSequenceSubSequence.toString();
            int i5 = -1;
            int length2 = string.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i6 = length2 - 1;
                    if (string.charAt(length2) != '0') {
                        i5 = length2;
                        break;
                    } else if (i6 < 0) {
                        break;
                    } else {
                        length2 = i6;
                    }
                }
            }
            int i7 = i5 + 1;
            if (z || i7 >= 3) {
                sb.append((CharSequence) string, 0, ((i5 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) string, 0, i7);
            }
        }
        sb.append(str);
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static final long m9618(long j) {
        long j2 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
        int i = AbstractC4578.f15108;
        return j2;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final long m9619(long j, long j2) {
        long j3 = j2 / 1000000;
        long jM7155 = AbstractC4009.m7155(j, j3);
        if (-4611686018426L > jM7155 || jM7155 >= 4611686018427L) {
            return AbstractC4009.m7183(jM7155);
        }
        long j4 = ((jM7155 * 1000000) + (j2 - (j3 * 1000000))) << 1;
        int i = AbstractC4578.f15108;
        return j4;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final int m9620(long j) {
        if (m9615(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static final long m9621(long j, EnumC3021 enumC3021) {
        if (j == f19126) {
            return Long.MAX_VALUE;
        }
        if (j == f19127) {
            return Long.MIN_VALUE;
        }
        return enumC3021.f10178.convert(j >> 1, ((((int) j) & 1) == 0 ? EnumC3021.NANOSECONDS : EnumC3021.MILLISECONDS).f10178);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return m9614(this.f19129, ((C5805) obj).f19129);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5805) {
            return this.f19129 == ((C5805) obj).f19129;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f19129);
    }

    public final String toString() {
        long jM9618 = this.f19129;
        if (jM9618 == 0) {
            return "0s";
        }
        if (jM9618 == f19126) {
            return "Infinity";
        }
        if (jM9618 == f19127) {
            return "-Infinity";
        }
        int i = 0;
        boolean z = jM9618 < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (jM9618 < 0) {
            jM9618 = m9618(jM9618);
        }
        long jM9621 = m9621(jM9618, EnumC3021.DAYS);
        int iM9621 = m9615(jM9618) ? 0 : (int) (m9621(jM9618, EnumC3021.HOURS) % 24);
        int iM9622 = m9615(jM9618) ? 0 : (int) (m9621(jM9618, EnumC3021.MINUTES) % 60);
        int iM9623 = m9615(jM9618) ? 0 : (int) (m9621(jM9618, EnumC3021.SECONDS) % 60);
        int iM9620 = m9620(jM9618);
        boolean z2 = jM9621 != 0;
        boolean z3 = iM9621 != 0;
        boolean z4 = iM9622 != 0;
        boolean z5 = (iM9623 == 0 && iM9620 == 0) ? false : true;
        if (z2) {
            sb.append(jM9621);
            sb.append('d');
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM9621);
            sb.append('h');
            i = i2;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM9622);
            sb.append('m');
            i = i3;
        }
        if (z5) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iM9623 != 0 || z2 || z3 || z4) {
                m9617(sb, iM9623, iM9620, 9, "s", false);
            } else if (iM9620 >= 1000000) {
                m9617(sb, iM9620 / 1000000, iM9620 % 1000000, 6, "ms", false);
            } else if (iM9620 >= 1000) {
                m9617(sb, iM9620 / 1000, iM9620 % 1000, 3, "us", false);
            } else {
                sb.append(iM9620);
                sb.append("ns");
            }
            i = i4;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
