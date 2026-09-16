package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ۦٞؑٗؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4780 implements InterfaceC5267 {

    /* JADX INFO: renamed from: ۥُ */
    public static final Charset f15766 = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: ۥّ */
    public static final C5802 f15767;

    /* JADX INFO: renamed from: ۥۜ */
    public static final C0872 f15768;

    /* JADX INFO: renamed from: ۦۙ */
    public static final C5802 f15769;

    /* JADX INFO: renamed from: ۥؗ */
    public final HashMap f15770;

    /* JADX INFO: renamed from: ۥۗ */
    public final HashMap f15771;

    /* JADX INFO: renamed from: ۥۣ */
    public OutputStream f15772;

    /* JADX INFO: renamed from: ۦؑ */
    public final C4254 f15773 = new C4254(this);

    static {
        C0364 c0364 = new C0364(1);
        HashMap map = new HashMap();
        map.put(InterfaceC3552.class, c0364);
        f15767 = new C5802("key", Collections.unmodifiableMap(new HashMap(map)));
        C0364 c0365 = new C0364(2);
        HashMap map2 = new HashMap();
        map2.put(InterfaceC3552.class, c0365);
        f15769 = new C5802("value", Collections.unmodifiableMap(new HashMap(map2)));
        f15768 = new C0872(1);
    }

    public C4780(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2) {
        this.f15772 = byteArrayOutputStream;
        this.f15771 = map;
        this.f15770 = map2;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static int m8164(C5802 c5802) {
        InterfaceC3552 interfaceC3552 = (InterfaceC3552) ((Annotation) c5802.f19118.get(InterfaceC3552.class));
        if (interfaceC3552 != null) {
            return interfaceC3552.tag();
        }
        throw new C5465("Field has no @Protobuf config");
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m8165(C5802 c5802, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        InterfaceC3552 interfaceC3552 = (InterfaceC3552) ((Annotation) c5802.f19118.get(InterfaceC3552.class));
        if (interfaceC3552 == null) {
            throw new C5465("Field has no @Protobuf config");
        }
        int iOrdinal = interfaceC3552.intEncoding().ordinal();
        if (iOrdinal == 0) {
            m8168(interfaceC3552.tag() << 3);
            m8168(i);
        } else if (iOrdinal == 1) {
            m8168(interfaceC3552.tag() << 3);
            m8168((i << 1) ^ (i >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            m8168((interfaceC3552.tag() << 3) | 5);
            this.f15772.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
        }
    }

    @Override // p000.InterfaceC5267
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC5267 mo6176(C5802 c5802, int i) {
        m8165(c5802, i, true);
        return this;
    }

    @Override // p000.InterfaceC5267
    /* JADX INFO: renamed from: ۥّ */
    public final InterfaceC5267 mo6177(C5802 c5802, double d) throws IOException {
        m8166(c5802, d, true);
        return this;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m8166(C5802 c5802, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return;
        }
        m8168((m8164(c5802) << 3) | 1);
        this.f15772.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m8167(C5802 c5802, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        InterfaceC3552 interfaceC3552 = (InterfaceC3552) ((Annotation) c5802.f19118.get(InterfaceC3552.class));
        if (interfaceC3552 == null) {
            throw new C5465("Field has no @Protobuf config");
        }
        int iOrdinal = interfaceC3552.intEncoding().ordinal();
        if (iOrdinal == 0) {
            m8168(interfaceC3552.tag() << 3);
            m8169(j);
        } else if (iOrdinal == 1) {
            m8168(interfaceC3552.tag() << 3);
            m8169((j >> 63) ^ (j << 1));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            m8168((interfaceC3552.tag() << 3) | 1);
            this.f15772.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    @Override // p000.InterfaceC5267
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC5267 mo6180(C5802 c5802, Object obj) {
        m8171(c5802, obj, true);
        return this;
    }

    @Override // p000.InterfaceC5267
    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC5267 mo6181(C5802 c5802, boolean z) {
        m8165(c5802, z ? 1 : 0, true);
        return this;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final void m8168(int i) throws IOException {
        while (true) {
            long j = i & (-128);
            OutputStream outputStream = this.f15772;
            if (j == 0) {
                outputStream.write(i & 127);
                return;
            } else {
                outputStream.write((i & 127) | 128);
                i >>>= 7;
            }
        }
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final void m8169(long j) throws IOException {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.f15772;
            if (j2 == 0) {
                outputStream.write(((int) j) & 127);
                return;
            } else {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            }
        }
    }

    /* JADX INFO: renamed from: ۦِ */
    public final void m8170(InterfaceC1588 interfaceC1588, C5802 c5802, Object obj, boolean z) throws IOException {
        C4652 c4652 = new C4652();
        c4652.f15345 = 0L;
        try {
            OutputStream outputStream = this.f15772;
            this.f15772 = c4652;
            try {
                interfaceC1588.mo206(obj, this);
                this.f15772 = outputStream;
                long j = c4652.f15345;
                c4652.close();
                if (z && j == 0) {
                    return;
                }
                m8168((m8164(c5802) << 3) | 2);
                m8169(j);
                interfaceC1588.mo206(obj, this);
            } catch (Throwable th) {
                this.f15772 = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c4652.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m8171(C5802 c5802, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            m8168((m8164(c5802) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f15766);
            m8168(bytes.length);
            this.f15772.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m8171(c5802, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m8170(f15768, c5802, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            m8166(c5802, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            m8168((m8164(c5802) << 3) | 5);
            this.f15772.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            m8167(c5802, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            m8165(c5802, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            m8168((m8164(c5802) << 3) | 2);
            m8168(bArr.length);
            this.f15772.write(bArr);
            return;
        }
        InterfaceC1588 interfaceC1588 = (InterfaceC1588) this.f15771.get(obj.getClass());
        if (interfaceC1588 != null) {
            m8170(interfaceC1588, c5802, obj, z);
            return;
        }
        InterfaceC3531 interfaceC3531 = (InterfaceC3531) this.f15770.get(obj.getClass());
        if (interfaceC3531 != null) {
            C4254 c4254 = this.f15773;
            c4254.f14097 = false;
            c4254.f14095 = c5802;
            c4254.f14096 = z;
            interfaceC3531.mo206(obj, c4254);
            return;
        }
        if (obj instanceof EnumC2114) {
            m8165(c5802, ((EnumC2114) obj).f6950, true);
        } else if (obj instanceof Enum) {
            m8165(c5802, ((Enum) obj).ordinal(), true);
        } else {
            m8170(AbstractC0993.f3545, c5802, obj, z);
        }
    }

    @Override // p000.InterfaceC5267
    /* JADX INFO: renamed from: ۦۙ */
    public final InterfaceC5267 mo6184(C5802 c5802, long j) throws IOException {
        m8167(c5802, j, true);
        return this;
    }
}
