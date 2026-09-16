package p000;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: ۦؘٖۙؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5134 extends AbstractC1567 {

    /* JADX INFO: renamed from: ۥُ */
    public static final C5051 f17010;

    /* JADX INFO: renamed from: ۥۗ */
    public final ClassLoader f17012;

    /* JADX INFO: renamed from: ۥؗ */
    public final AbstractC1567 f17011 = AbstractC1567.f5283;

    /* JADX INFO: renamed from: ۦؑ */
    public final C2432 f17013 = new C2432(new C5285(21, this));

    static {
        String str = C5051.f16766;
        f17010 = C4992.m8381("/");
    }

    public C5134(ClassLoader classLoader) {
        this.f17012 = classLoader;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static String m8747(C5051 c5051) {
        C5051 c5052 = f17010;
        c5052.getClass();
        return AbstractC0088.m8666(c5052, c5051, true).m8569(c5052).f16767.m2214();
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo1562(C5051 c5051) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۥّ */
    public final List mo1563(C5051 c5051) throws FileNotFoundException {
        String strM8747 = m8747(c5051);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (C3869 c3869 : (List) this.f17013.getValue()) {
            AbstractC1567 abstractC1567 = (AbstractC1567) c3869.f12915;
            C5051 c5052 = (C5051) c3869.f12914;
            try {
                List listMo1563 = abstractC1567.mo1563(c5052.m8573(strM8747));
                ArrayList<C5051> arrayList = new ArrayList();
                for (Object obj : listMo1563) {
                    if (AbstractC1605.m3342((C5051) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC5573.m9402(arrayList, 10));
                for (C5051 c5053 : arrayList) {
                    arrayList2.add(f17010.m8573(AbstractC0684.m1518(c5053.f16767.m2214(), c5052.f16767.m2214()).replace('\\', '/')));
                }
                AbstractC3649.m6529(arrayList2, linkedHashSet);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return AbstractC0973.m2039(linkedHashSet);
        }
        C5028.m8454(c5051, "file not found: ");
        return null;
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo1564(C5051 c5051, C5051 c5052) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۥۜ */
    public final C1377 mo1565(C5051 c5051) {
        if (!AbstractC1605.m3342(c5051)) {
            return null;
        }
        String strM8747 = m8747(c5051);
        for (C3869 c3869 : (List) this.f17013.getValue()) {
            C1377 c1377Mo1565 = ((AbstractC1567) c3869.f12915).mo1565(((C5051) c3869.f12914).m8573(strM8747));
            if (c1377Mo1565 != null) {
                return c1377Mo1565;
            }
        }
        return null;
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC3832 mo1566(C5051 c5051) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo1567(C5051 c5051) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۦِ */
    public final InterfaceC3832 mo1568(C5051 c5051) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۦٛ */
    public final C3886 mo1569(C5051 c5051) throws FileNotFoundException {
        if (!AbstractC1605.m3342(c5051)) {
            C5028.m8454(c5051, "file not found: ");
            return null;
        }
        String strM8747 = m8747(c5051);
        Iterator it = ((List) this.f17013.getValue()).iterator();
        while (it.hasNext()) {
            C3869 c3869 = (C3869) it.next();
            try {
                return ((AbstractC1567) c3869.f12915).mo1569(((C5051) c3869.f12914).m8573(strM8747));
            } catch (FileNotFoundException unused) {
            }
        }
        C5028.m8454(c5051, "file not found: ");
        return null;
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۦۗ */
    public final InterfaceC4598 mo1570(C5051 c5051) throws FileNotFoundException {
        if (!AbstractC1605.m3342(c5051)) {
            C5028.m8454(c5051, "file not found: ");
            return null;
        }
        C5051 c5052 = f17010;
        c5052.getClass();
        InputStream resourceAsStream = this.f17012.getResourceAsStream(AbstractC0088.m8666(c5052, c5051, false).m8569(c5052).f16767.m2214());
        if (resourceAsStream != null) {
            return AbstractC2235.m4287(resourceAsStream);
        }
        C5028.m8454(c5051, "file not found: ");
        return null;
    }
}
