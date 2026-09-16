package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ۦؗؑۧۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3402 {

    /* JADX INFO: renamed from: ۥۣ */
    public final Map f11319;

    public C3402(Map map) {
        this.f11319 = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3402)) {
            return false;
        }
        return this.f11319.equals(((C3402) obj).f11319);
    }

    public final int hashCode() {
        return this.f11319.hashCode() * 31;
    }

    public final String toString() {
        return "MapDraggableAnchors(" + this.f11319 + ')';
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final float m6154() {
        Float fValueOf;
        Iterator it = this.f11319.values().iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.min(fFloatValue, ((Number) it.next()).floatValue());
            }
            fValueOf = Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final Object m6155(float f, boolean z) {
        Object next;
        Iterator it = this.f11319.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fFloatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f2 = z ? fFloatValue - f : f - fFloatValue;
                if (f2 < 0.0f) {
                    f2 = Float.POSITIVE_INFINITY;
                }
                do {
                    Object next2 = it.next();
                    float fFloatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f3 = z ? fFloatValue2 - f : f - fFloatValue2;
                    if (f3 < 0.0f) {
                        f3 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f2, f3) > 0) {
                        next = next2;
                        f2 = f3;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final Object m6156(float f) {
        Object next;
        Iterator it = this.f11319.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(f - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    Object next2 = it.next();
                    float fAbs2 = Math.abs(f - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final float m6157(Object obj) {
        Float f = (Float) this.f11319.get(obj);
        if (f != null) {
            return f.floatValue();
        }
        return Float.NaN;
    }
}
