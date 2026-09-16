package p000;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ۦٍؗؓۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3413 implements InterfaceC5267, InterfaceC4944 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Map f11365;

    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC1588 f11366;

    /* JADX INFO: renamed from: ۥّ */
    public final boolean f11367;

    /* JADX INFO: renamed from: ۥۗ */
    public final JsonWriter f11368;

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean f11369 = true;

    /* JADX INFO: renamed from: ۦؑ */
    public final Map f11370;

    public C3413(Writer writer, HashMap map, HashMap map2, C0872 c0872, boolean z) {
        this.f11368 = new JsonWriter(writer);
        this.f11365 = map;
        this.f11370 = map2;
        this.f11366 = c0872;
        this.f11367 = z;
    }

    @Override // p000.InterfaceC4944
    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC4944 mo6175(boolean z) throws IOException {
        m6182();
        this.f11368.value(z);
        return this;
    }

    @Override // p000.InterfaceC5267
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC5267 mo6176(C5802 c5802, int i) throws IOException {
        String str = c5802.f19119;
        m6182();
        JsonWriter jsonWriter = this.f11368;
        jsonWriter.name(str);
        m6182();
        jsonWriter.value(i);
        return this;
    }

    @Override // p000.InterfaceC5267
    /* JADX INFO: renamed from: ۥّ */
    public final InterfaceC5267 mo6177(C5802 c5802, double d) throws IOException {
        String str = c5802.f19119;
        m6182();
        JsonWriter jsonWriter = this.f11368;
        jsonWriter.name(str);
        m6182();
        jsonWriter.value(d);
        return this;
    }

    @Override // p000.InterfaceC4944
    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC4944 mo6178(String str) throws IOException {
        m6182();
        this.f11368.value(str);
        return this;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final C3413 m6179(Object obj) throws IOException {
        JsonWriter jsonWriter = this.f11368;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    m6179(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        m6183(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new C5465(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            InterfaceC1588 interfaceC1588 = (InterfaceC1588) this.f11365.get(obj.getClass());
            if (interfaceC1588 != null) {
                jsonWriter.beginObject();
                interfaceC1588.mo206(obj, this);
                jsonWriter.endObject();
                return this;
            }
            InterfaceC3531 interfaceC3531 = (InterfaceC3531) this.f11370.get(obj.getClass());
            if (interfaceC3531 != null) {
                interfaceC3531.mo206(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.f11366.mo206(obj, this);
                jsonWriter.endObject();
                return this;
            }
            if (obj instanceof InterfaceC1703) {
                int iMo3511 = ((InterfaceC1703) obj).mo3511();
                m6182();
                jsonWriter.value(iMo3511);
                return this;
            }
            String strName = ((Enum) obj).name();
            m6182();
            jsonWriter.value(strName);
            return this;
        }
        if (obj instanceof byte[]) {
            m6182();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i < length) {
                jsonWriter.value(iArr[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                m6182();
                jsonWriter.value(j);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                m6179(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                m6179(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    @Override // p000.InterfaceC5267
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC5267 mo6180(C5802 c5802, Object obj) throws IOException {
        m6183(obj, c5802.f19119);
        return this;
    }

    @Override // p000.InterfaceC5267
    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC5267 mo6181(C5802 c5802, boolean z) throws IOException {
        String str = c5802.f19119;
        m6182();
        JsonWriter jsonWriter = this.f11368;
        jsonWriter.name(str);
        m6182();
        jsonWriter.value(z);
        return this;
    }

    /* JADX INFO: renamed from: ۦِ */
    public final void m6182() {
        if (this.f11369) {
            return;
        }
        C1078.m2276("Parent context used since this context was created. Cannot use this context anymore.");
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final C3413 m6183(Object obj, String str) throws IOException {
        boolean z = this.f11367;
        JsonWriter jsonWriter = this.f11368;
        if (z) {
            if (obj == null) {
                return this;
            }
            m6182();
            jsonWriter.name(str);
            m6179(obj);
            return this;
        }
        m6182();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        m6179(obj);
        return this;
    }

    @Override // p000.InterfaceC5267
    /* JADX INFO: renamed from: ۦۙ */
    public final InterfaceC5267 mo6184(C5802 c5802, long j) throws IOException {
        String str = c5802.f19119;
        m6182();
        JsonWriter jsonWriter = this.f11368;
        jsonWriter.name(str);
        m6182();
        jsonWriter.value(j);
        return this;
    }
}
