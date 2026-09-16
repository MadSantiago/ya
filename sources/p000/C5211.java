package p000;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: renamed from: ۦۛؑٞٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5211 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C5211 f17218 = new C5211(100);

    /* JADX INFO: renamed from: ۥۗ */
    public final int f17219;

    /* JADX INFO: renamed from: ۥۣ */
    public final EnumMap f17220;

    public C5211(int i) {
        EnumMap enumMap = new EnumMap(EnumC4635.class);
        this.f17220 = enumMap;
        EnumC4635 enumC4635 = EnumC4635.f15302;
        EnumC3687 enumC3687 = EnumC3687.f12307;
        enumMap.put(enumC4635, enumC3687);
        enumMap.put(EnumC4635.f15299, enumC3687);
        this.f17219 = i;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static C5211 m8806(int i, String str) {
        EnumMap enumMap = new EnumMap(EnumC4635.class);
        EnumC4635[] enumC4635Arr = EnumC0998.STORAGE.f3575;
        for (int i2 = 0; i2 < enumC4635Arr.length; i2++) {
            String str2 = str == null ? "" : str;
            EnumC4635 enumC4635 = enumC4635Arr[i2];
            int i3 = i2 + 2;
            if (i3 < str2.length()) {
                enumMap.put(enumC4635, m8807(str2.charAt(i3)));
            } else {
                enumMap.put(enumC4635, EnumC3687.f12307);
            }
        }
        return new C5211(enumMap, i);
    }

    /* JADX INFO: renamed from: ۥُ */
    public static EnumC3687 m8807(char c) {
        if (c == '+') {
            return EnumC3687.f12304;
        }
        if (c != '0') {
            return c != '1' ? EnumC3687.f12307 : EnumC3687.f12303;
        }
        return EnumC3687.f12305;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static C5211 m8808(int i, Bundle bundle) {
        if (bundle == null) {
            return new C5211(i);
        }
        EnumMap enumMap = new EnumMap(EnumC4635.class);
        for (EnumC4635 enumC4635 : EnumC0998.STORAGE.f3575) {
            enumMap.put(enumC4635, m8811(bundle.getString(enumC4635.f15303)));
        }
        return new C5211(enumMap, i);
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static char m8809(EnumC3687 enumC3687) {
        if (enumC3687 == null) {
            return '-';
        }
        int iOrdinal = enumC3687.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static String m8810(int i) {
        if (i == -30) {
            return "TCF";
        }
        if (i == -20) {
            return "API";
        }
        if (i == -10) {
            return "MANIFEST";
        }
        if (i == 0) {
            return "1P_API";
        }
        if (i == 30) {
            return "1P_INIT";
        }
        if (i != 90) {
            return i != 100 ? "OTHER" : "UNKNOWN";
        }
        return "REMOTE_CONFIG";
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static EnumC3687 m8811(String str) {
        EnumC3687 enumC3687 = EnumC3687.f12307;
        if (str == null) {
            return enumC3687;
        }
        if (str.equals("granted")) {
            return EnumC3687.f12303;
        }
        return str.equals("denied") ? EnumC3687.f12305 : enumC3687;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static boolean m8812(int i, int i2) {
        int i3 = -30;
        if (i == -20) {
            if (i2 == -30) {
                return true;
            }
            i = -20;
        }
        if (i != -30) {
            i3 = i;
        } else if (i2 == -20) {
            return true;
        }
        return i3 == i2 || i < i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5211) {
            C5211 c5211 = (C5211) obj;
            for (EnumC4635 enumC4635 : EnumC0998.STORAGE.f3575) {
                if (this.f17220.get(enumC4635) == c5211.f17220.get(enumC4635)) {
                }
            }
            if (this.f17219 == c5211.f17219) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = this.f17220.values().iterator();
        int iHashCode = this.f17219 * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((EnumC3687) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(m8810(this.f17219));
        for (EnumC4635 enumC4635 : EnumC0998.STORAGE.f3575) {
            sb.append(",");
            sb.append(enumC4635.f15303);
            sb.append("=");
            EnumC3687 enumC3687 = (EnumC3687) this.f17220.get(enumC4635);
            if (enumC3687 == null) {
                enumC3687 = EnumC3687.f12307;
            }
            sb.append(enumC3687);
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    /* JADX INFO: renamed from: ۥّ */
    public final String m8813() {
        int iOrdinal;
        StringBuilder sb = new StringBuilder("G1");
        for (EnumC4635 enumC4635 : EnumC0998.STORAGE.f3575) {
            EnumC3687 enumC3687 = (EnumC3687) this.f17220.get(enumC4635);
            char c = '-';
            if (enumC3687 != null && (iOrdinal = enumC3687.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c = '1';
                } else if (iOrdinal == 2) {
                    c = '0';
                } else if (iOrdinal == 3) {
                    c = '1';
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX INFO: renamed from: ۦِ */
    public final C5211 m8814(C5211 c5211) {
        EnumMap enumMap = new EnumMap(EnumC4635.class);
        for (EnumC4635 enumC4635 : EnumC0998.STORAGE.f3575) {
            EnumC3687 enumC3687 = (EnumC3687) this.f17220.get(enumC4635);
            EnumC3687 enumC3688 = (EnumC3687) c5211.f17220.get(enumC4635);
            if (enumC3687 == null) {
                enumC3687 = enumC3688;
            } else if (enumC3688 != null) {
                EnumC3687 enumC3689 = EnumC3687.f12307;
                if (enumC3687 == enumC3689) {
                    enumC3687 = enumC3688;
                } else if (enumC3688 != enumC3689) {
                    EnumC3687 enumC36810 = EnumC3687.f12304;
                    if (enumC3687 == enumC36810) {
                        enumC3687 = enumC3688;
                    } else if (enumC3688 != enumC36810) {
                        EnumC3687 enumC36811 = EnumC3687.f12305;
                        enumC3687 = (enumC3687 == enumC36811 || enumC3688 == enumC36811) ? enumC36811 : EnumC3687.f12303;
                    }
                }
            }
            if (enumC3687 != null) {
                enumMap.put(enumC4635, enumC3687);
            }
        }
        return new C5211(enumMap, 100);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final boolean m8815(EnumC4635 enumC4635) {
        return ((EnumC3687) this.f17220.get(enumC4635)) != EnumC3687.f12305;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final C5211 m8816(C5211 c5211) {
        EnumMap enumMap = new EnumMap(EnumC4635.class);
        for (EnumC4635 enumC4635 : EnumC0998.STORAGE.f3575) {
            EnumC3687 enumC3687 = (EnumC3687) this.f17220.get(enumC4635);
            if (enumC3687 == EnumC3687.f12307) {
                enumC3687 = (EnumC3687) c5211.f17220.get(enumC4635);
            }
            if (enumC3687 != null) {
                enumMap.put(enumC4635, enumC3687);
            }
        }
        return new C5211(enumMap, this.f17219);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final String m8817() {
        StringBuilder sb = new StringBuilder("G1");
        for (EnumC4635 enumC4635 : EnumC0998.STORAGE.f3575) {
            sb.append(m8809((EnumC3687) this.f17220.get(enumC4635)));
        }
        return sb.toString();
    }

    public C5211(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(EnumC4635.class);
        this.f17220 = enumMap2;
        enumMap2.putAll(enumMap);
        this.f17219 = i;
    }
}
