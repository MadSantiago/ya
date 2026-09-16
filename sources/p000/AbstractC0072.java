package p000;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: ۦٓ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0072 {

    /* JADX INFO: renamed from: ۥْ */
    public Serializable f13680;

    /* JADX INFO: renamed from: ۥٓ */
    public Object f13681;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f13682 = -1;

    /* JADX INFO: renamed from: ۦۨ */
    public int f13683;

    public AbstractC0072(String str, int i, Map map) {
        this.f13680 = str;
        this.f13683 = i;
        this.f13681 = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.Serializable, ۦً[]] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Serializable, ۦً[]] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [ۦً] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX INFO: renamed from: ۥؗ */
    public AbstractC0063 m7283() {
        ?? r0;
        ?? r2;
        C5693 c5693;
        synchronized (this) {
            try {
                AbstractC0063[] abstractC0063Arr = (AbstractC0063[]) this.f13680;
                if (abstractC0063Arr == null) {
                    ?? Mo7285 = mo7285();
                    this.f13680 = Mo7285;
                    r0 = Mo7285;
                } else if (this.f13683 >= abstractC0063Arr.length) {
                    r0 = abstractC0063Arr;
                    Object[] objArrCopyOf = Arrays.copyOf(abstractC0063Arr, abstractC0063Arr.length * 2);
                    this.f13680 = (AbstractC0063[]) objArrCopyOf;
                    r0 = (AbstractC0063[]) objArrCopyOf;
                }
                r0 = abstractC0063Arr;
                int i = this.f13682;
                do {
                    ?? r3 = r0[i];
                    r2 = r3;
                    if (r3 == 0) {
                        AbstractC0063 abstractC0063Mo7284 = mo7284();
                        r0[i] = abstractC0063Mo7284;
                        r2 = abstractC0063Mo7284;
                    }
                    i++;
                    if (i >= r0.length) {
                        i = 0;
                    }
                } while (!r2.mo6444(this));
                this.f13682 = i;
                this.f13683++;
                c5693 = (C5693) this.f13681;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c5693 != null) {
            c5693.m9505(1);
        }
        return r2;
    }

    /* JADX INFO: renamed from: ۥُ */
    public abstract AbstractC0063 mo7284();

    /* JADX INFO: renamed from: ۥّ */
    public abstract AbstractC0063[] mo7285();

    /* JADX INFO: renamed from: ۥۜ */
    public abstract C0446 mo967();

    /* JADX INFO: renamed from: ۦؑ */
    public Map mo968() {
        return (Map) this.f13681;
    }

    /* JADX INFO: renamed from: ۦِ */
    public abstract boolean mo970();

    /* JADX INFO: renamed from: ۦٛ */
    public C5693 m7286() {
        C5693 c5693;
        synchronized (this) {
            c5693 = (C5693) this.f13681;
            if (c5693 == null) {
                int i = this.f13683;
                c5693 = new C5693(1, Integer.MAX_VALUE, 2);
                c5693.m9665(Integer.valueOf(i));
                this.f13681 = c5693;
            }
        }
        return c5693;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public boolean m7287() {
        return this.f13682 > -1;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public void m7288(AbstractC0063 abstractC0063) {
        C5693 c5693;
        int i;
        InterfaceC0443[] interfaceC0443ArrMo6443;
        synchronized (this) {
            try {
                int i2 = this.f13683 - 1;
                this.f13683 = i2;
                c5693 = (C5693) this.f13681;
                if (i2 == 0) {
                    this.f13682 = 0;
                }
                interfaceC0443ArrMo6443 = abstractC0063.mo6443(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC0443 interfaceC0443 : interfaceC0443ArrMo6443) {
            if (interfaceC0443 != null) {
                interfaceC0443.mo335(C2358.f7817);
            }
        }
        if (c5693 != null) {
            c5693.m9505(-1);
        }
    }
}
