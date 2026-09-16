package p000;

import android.net.Uri;
import android.os.Process;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: ۦۖؒۛٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4898 implements InterfaceC3324 {

    /* JADX INFO: renamed from: ۦ۟ */
    public Object f16142;

    /* JADX INFO: renamed from: ۦۨ */
    public Object f16143;

    public C4898(C2391 c2391, int i) {
        this.f16142 = c2391;
        this.f16143 = new AtomicReferenceArray(i);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public AbstractC4804 m8235(long j, String str, int i) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.f16143;
        AbstractC4804 abstractC4804 = (AbstractC4804) atomicReferenceArray.get(i);
        if (abstractC4804 != null) {
            return abstractC4804;
        }
        C3817 c3817 = new C3817(str, (C3225) ((C2391) this.f16142).f7924, j);
        while (!atomicReferenceArray.compareAndSet(i, null, c3817)) {
            if (atomicReferenceArray.get(i) != null) {
                AbstractC4804 abstractC4805 = (AbstractC4804) atomicReferenceArray.get(i);
                abstractC4805.getClass();
                return abstractC4805;
            }
        }
        return c3817;
    }

    /* JADX INFO: renamed from: ۥُ */
    public AbstractC4804 m8236(int i, String str, String str2) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.f16143;
        AbstractC4804 abstractC4804 = (AbstractC4804) atomicReferenceArray.get(i);
        if (abstractC4804 != null) {
            return abstractC4804;
        }
        C3606 c3606 = new C3606(str, (C3225) ((C2391) this.f16142).f7924, str2);
        while (!atomicReferenceArray.compareAndSet(i, null, c3606)) {
            if (atomicReferenceArray.get(i) != null) {
                AbstractC4804 abstractC4805 = (AbstractC4804) atomicReferenceArray.get(i);
                abstractC4805.getClass();
                return abstractC4805;
            }
        }
        return c3606;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public AbstractC4804 m8237(int i, String str, boolean z) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.f16143;
        AbstractC4804 abstractC4804 = (AbstractC4804) atomicReferenceArray.get(i);
        if (abstractC4804 != null) {
            return abstractC4804;
        }
        C5856 c5856M4474 = ((C2391) this.f16142).m4474(str, z);
        while (!atomicReferenceArray.compareAndSet(i, null, c5856M4474)) {
            if (atomicReferenceArray.get(i) != null) {
                AbstractC4804 abstractC4805 = (AbstractC4804) atomicReferenceArray.get(i);
                abstractC4805.getClass();
                return abstractC4805;
            }
        }
        return c5856M4474;
    }

    @Override // p000.InterfaceC3324
    /* JADX INFO: renamed from: ۥۣ */
    public Object mo5516(C3455 c3455) throws IOException {
        Uri uri = c3455.f11472;
        AtomicLong atomicLong = AbstractC3024.f10185;
        int iMyPid = Process.myPid();
        long id = Thread.currentThread().getId();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long andIncrement = AbstractC3024.f10185.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(iMyPid).length() + 15 + String.valueOf(id).length() + 1 + String.valueOf(jCurrentTimeMillis).length() + 1 + String.valueOf(andIncrement).length());
        sb.append(".mobstore_tmp-");
        sb.append(iMyPid);
        sb.append("-");
        sb.append(id);
        sb.append("-");
        sb.append(jCurrentTimeMillis);
        sb.append("-");
        sb.append(andIncrement);
        Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(sb.toString())).build();
        InterfaceC1008 interfaceC1008 = c3455.f11471;
        OutputStream outputStreamMo2218 = interfaceC1008.mo2218(uriBuild);
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStreamMo2218);
        ArrayList arrayList2 = c3455.f11469;
        if (!arrayList2.isEmpty()) {
            int i = C5061.f16797;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                throw AbstractC5078.m8675(it);
            }
            C5061 c5061 = !arrayList3.isEmpty() ? new C5061(outputStreamMo2218, arrayList3) : null;
            if (c5061 != null) {
                arrayList.add(c5061);
            }
        }
        Iterator it2 = c3455.f11470.iterator();
        if (!it2.hasNext()) {
            Collections.reverse(arrayList);
        } else {
            if (it2.next() == null) {
                throw null;
            }
            C0178.m382();
            arrayList = null;
        }
        C4898[] c4898Arr = (C4898[]) this.f16142;
        if (c4898Arr != null) {
            C4898 c4898 = c4898Arr[0];
            c4898.getClass();
            OutputStream outputStream = (OutputStream) AbstractC4225.m7472(arrayList);
            if (outputStream instanceof C3493) {
                c4898.f16142 = (C3493) outputStream;
                c4898.f16143 = (OutputStream) arrayList.get(0);
            }
        }
        try {
            OutputStream outputStream2 = (OutputStream) arrayList.get(0);
            try {
                AbstractC3127 abstractC3127 = (AbstractC3127) this.f16143;
                abstractC3127.getClass();
                AbstractC5212 abstractC5212 = (AbstractC5212) abstractC3127;
                int iM8830 = abstractC5212.m8830();
                boolean z = AbstractC0438.f1609;
                if (iM8830 > 4096) {
                    iM8830 = 4096;
                }
                C1168 c1168 = new C1168(outputStream2, iM8830);
                abstractC5212.m8827(c1168);
                if (c1168.f4052 > 0) {
                    c1168.m2490();
                }
                C4898[] c4898Arr2 = (C4898[]) this.f16142;
                if (c4898Arr2 != null) {
                    C4898 c4899 = c4898Arr2[0];
                    if (((C3493) c4899.f16142) == null) {
                        throw new C2943("Cannot sync underlying stream");
                    }
                    ((OutputStream) c4899.f16143).flush();
                    ((C3493) c4899.f16142).f11591.getFD().sync();
                }
                outputStream2.close();
                interfaceC1008.mo2220(uriBuild, uri);
                return null;
            } catch (Throwable th) {
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            try {
                interfaceC1008.mo2216(uriBuild);
            } catch (FileNotFoundException unused) {
            }
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public void m8238(C1489 c1489, C5460 c5460) {
        C1759 c1759 = new C1759(c5460);
        TreeMap treeMap = (TreeMap) this.f16143;
        for (Integer num : treeMap.keySet()) {
            C0606 c0606M1370 = ((C0606) c5460.f17999).clone();
            InterfaceC2150 interfaceC2150Mo779 = ((C2929) treeMap.get(num)).mo779(c1489, Collections.singletonList(c1759));
            int iM3354 = interfaceC2150Mo779 instanceof C5563 ? AbstractC1605.m3354(((C5563) interfaceC2150Mo779).f18369.doubleValue()) : -1;
            if (iM3354 == 2 || iM3354 == -1) {
                c5460.f17999 = c0606M1370;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.f16142;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            InterfaceC2150 interfaceC2150Mo7710 = ((C2929) treeMap2.get((Integer) it.next())).mo779(c1489, Collections.singletonList(c1759));
            if (interfaceC2150Mo7710 instanceof C5563) {
                AbstractC1605.m3354(((C5563) interfaceC2150Mo7710).f18369.doubleValue());
            }
        }
    }

    public C4898(AbstractC3127 abstractC3127) {
        this.f16143 = abstractC3127;
    }
}
