package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ۦۤؗٗٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5676 implements InterfaceC1150 {

    /* JADX INFO: renamed from: ۦۨ */
    public final Object f18660;

    public AbstractC5676(int i) {
        switch (i) {
            case 1:
                this.f18660 = new Object();
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
            default:
                this.f18660 = new ArrayList();
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                this.f18660 = new ConcurrentHashMap();
                break;
        }
    }

    @Override // p000.InterfaceC1150
    /* JADX INFO: renamed from: ۥُ */
    public Context mo2402() {
        throw null;
    }

    @Override // p000.InterfaceC1150
    /* JADX INFO: renamed from: ۥّ */
    public C1397 mo2403() {
        throw null;
    }

    /* JADX INFO: renamed from: ۥْ */
    public void mo6517() {
        C3644 c3644 = ((C5371) this.f18660).f17733;
        C5371.m9020(c3644);
        c3644.mo6517();
    }

    @Override // p000.InterfaceC1150
    /* JADX INFO: renamed from: ۥۗ */
    public C3610 mo2404() {
        throw null;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public void m9493(int i, AbstractC5020 abstractC5020, Object obj) {
        ((ArrayList) this.f18660).add(new C1470(i, null, null));
    }

    @Override // p000.InterfaceC1150
    /* JADX INFO: renamed from: ۥۣ */
    public C4452 mo2405() {
        throw null;
    }

    @Override // p000.InterfaceC1150
    /* JADX INFO: renamed from: ۦؑ */
    public C3644 mo2406() {
        throw null;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public void m9494(int i, Object obj, AbstractC5020 abstractC5020, Object obj2) {
        if (AbstractC3831.m6874(obj, C2850.f9517)) {
            m9493(i, abstractC5020, null);
        }
    }

    /* JADX INFO: renamed from: ۦٌ */
    public abstract InterfaceC4745 mo7668(InterfaceC4783 interfaceC4783);

    /* JADX INFO: renamed from: ۦِ */
    public abstract void mo7669();

    /* JADX INFO: renamed from: ۦٛ */
    public abstract void mo7670(InterfaceC4783 interfaceC4783);

    /* JADX INFO: renamed from: ۦۗ */
    public abstract void mo7671();

    /* JADX INFO: renamed from: ۦۙ */
    public boolean m9495(int i, AbstractC5020 abstractC5020, Object obj) {
        ArrayList arrayList = abstractC5020.f16608;
        if (arrayList == null) {
            m9493(i, abstractC5020, null);
            return true;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = arrayList.get(i2);
            if (!(obj2 instanceof C4356)) {
                if (!(obj2 instanceof AbstractC5020)) {
                    C5028.m8449(obj2, "Unexpected child source info ");
                    break;
                }
                if (m9495(i, (AbstractC5020) obj2, obj)) {
                    m9493(0, abstractC5020, obj2);
                    return true;
                }
            } else if (obj2 == obj) {
                m9493(0, abstractC5020, obj2);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public abstract void mo7672(InterfaceC4541 interfaceC4541);

    /* JADX INFO: renamed from: ۦ۟ */
    public Object m9496(InterfaceC4083 interfaceC4083, AbstractC4489 abstractC4489) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f18660;
        Object obj = concurrentHashMap.get(interfaceC4083);
        if (obj != null) {
            return obj;
        }
        Object objMo3378 = mo3378();
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(interfaceC4083, objMo3378);
        if (objPutIfAbsent != null) {
            return objPutIfAbsent;
        }
        int iMo1150 = abstractC4489.mo1150();
        for (int i = 0; i < iMo1150; i++) {
            if (AbstractC1676.f5584.equals(abstractC4489.mo1149(i))) {
                abstractC4489.mo1145(i);
            }
        }
        return objMo3378;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public abstract Object mo3378();

    public AbstractC5676(C5371 c5371) {
        AbstractC0487.m1047(c5371);
        this.f18660 = c5371;
    }
}
