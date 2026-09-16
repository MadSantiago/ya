package p000;

import java.util.Map;

/* JADX INFO: renamed from: ۦُؒؑٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C3889 implements Map.Entry, InterfaceC3984 {

    /* JADX INFO: renamed from: ۥْ */
    public final Object f13001;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object f13002;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f13003;

    public /* synthetic */ C3889(int i, Object obj, Object obj2) {
        this.f13003 = i;
        this.f13002 = obj;
        this.f13001 = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.f13003) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && AbstractC3831.m6874(entry.getKey(), this.f13002) && AbstractC3831.m6874(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f13003) {
            case 0:
                break;
        }
        return this.f13002;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.f13003) {
            case 0:
                break;
        }
        return this.f13001;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.f13003) {
            case 0:
                Object obj = this.f13002;
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return iHashCode ^ (value != null ? value.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.f13003) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.f13003) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(this.f13002);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
