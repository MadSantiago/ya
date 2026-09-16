package p000;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;

/* JADX INFO: renamed from: ۦۧؑؖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5800 {

    /* JADX INFO: renamed from: ۥّ */
    public static final C5800 f19111 = new C5800((Boolean) null, 100, (Boolean) null, (String) null);

    /* JADX INFO: renamed from: ۥؗ */
    public final Boolean f19112;

    /* JADX INFO: renamed from: ۥُ */
    public final EnumMap f19113;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f19114;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f19115;

    /* JADX INFO: renamed from: ۦؑ */
    public final String f19116;

    public C5800(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(EnumC4635.class);
        this.f19113 = enumMap;
        enumMap.put(EnumC4635.f15300, bool == null ? EnumC3687.f12307 : bool.booleanValue() ? EnumC3687.f12303 : EnumC3687.f12305);
        this.f19115 = i;
        this.f19114 = m9612();
        this.f19112 = bool2;
        this.f19116 = str;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static C5800 m9609(int i, Bundle bundle) {
        if (bundle == null) {
            return new C5800((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(EnumC4635.class);
        for (EnumC4635 enumC4635 : EnumC0998.DMA.f3575) {
            enumMap.put(enumC4635, C5211.m8811(bundle.getString(enumC4635.f15303)));
        }
        return new C5800(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static C5800 m9610(String str) {
        if (str == null || str.length() <= 0) {
            return f19111;
        }
        String[] strArrSplit = str.split(":");
        int i = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(EnumC4635.class);
        EnumC4635[] enumC4635Arr = EnumC0998.DMA.f3575;
        int length = enumC4635Arr.length;
        int i2 = 1;
        int i3 = 0;
        while (i3 < length) {
            enumMap.put(enumC4635Arr[i3], C5211.m8807(strArrSplit[i2].charAt(0)));
            i3++;
            i2++;
        }
        return new C5800(enumMap, i, (Boolean) null, (String) null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5800)) {
            return false;
        }
        C5800 c5800 = (C5800) obj;
        if (this.f19114.equalsIgnoreCase(c5800.f19114) && Objects.equals(this.f19112, c5800.f19112)) {
            return Objects.equals(this.f19116, c5800.f19116);
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Boolean bool = this.f19112;
        if (bool == null) {
            i = 3;
        } else {
            i = true != bool.booleanValue() ? 13 : 7;
        }
        String str = this.f19116;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.f19114.hashCode() + (i * 29);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(C5211.m8810(this.f19115));
        for (EnumC4635 enumC4635 : EnumC0998.DMA.f3575) {
            sb.append(",");
            sb.append(enumC4635.f15303);
            sb.append("=");
            EnumC3687 enumC3687 = (EnumC3687) this.f19113.get(enumC4635);
            if (enumC3687 == null) {
                sb.append("uninitialized");
            } else {
                int iOrdinal = enumC3687.ordinal();
                if (iOrdinal == 0) {
                    sb.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb.append("denied");
                } else if (iOrdinal == 3) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.f19112;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.f19116;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final EnumC3687 m9611() {
        EnumC3687 enumC3687 = (EnumC3687) this.f19113.get(EnumC4635.f15300);
        return enumC3687 == null ? EnumC3687.f12307 : enumC3687;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final String m9612() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19115);
        for (EnumC4635 enumC4635 : EnumC0998.DMA.f3575) {
            sb.append(":");
            sb.append(C5211.m8809((EnumC3687) this.f19113.get(enumC4635)));
        }
        return sb.toString();
    }

    public C5800(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(EnumC4635.class);
        this.f19113 = enumMap2;
        enumMap2.putAll(enumMap);
        this.f19115 = i;
        this.f19114 = m9612();
        this.f19112 = bool;
        this.f19116 = str;
    }
}
