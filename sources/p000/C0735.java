package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۥٍؙؕۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C0735 {

    /* JADX INFO: renamed from: ۥۗ */
    public int f2676;

    /* JADX INFO: renamed from: ۥۣ */
    public final List f2677;

    public C0735(int i, ArrayList arrayList) {
        this.f2677 = (i & 1) != 0 ? new ArrayList() : arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0735) {
            return this.f2677.equals(((C0735) obj).f2677);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2677.hashCode() * 31;
    }

    public final String toString() {
        return "DefinitionParameters" + AbstractC0973.m2039(this.f2677);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0045 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0046 A[RETURN] */
    /* JADX INFO: renamed from: ۥۣ */
    public Object mo1623(C3131 c3131) {
        List list = this.f2677;
        if (list.isEmpty()) {
            return null;
        }
        Object obj = list.get(this.f2676);
        if (!c3131.m5774(obj)) {
            obj = null;
        }
        if (obj == null) {
            obj = null;
        }
        if (obj != null && this.f2676 < AbstractC2164.m4181(list)) {
            this.f2676++;
        }
        if (obj != null) {
            return obj;
        }
        for (Object obj2 : list) {
            if (c3131.m5774(obj2)) {
                if (obj2 == null) {
                    return null;
                }
                return obj2;
            }
        }
        obj2 = null;
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }
}
