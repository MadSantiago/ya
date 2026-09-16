package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: ۥؐؒۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0111 extends RuntimeException {

    /* JADX INFO: renamed from: ۥْ */
    public final C4523 f440;

    /* JADX INFO: renamed from: ۥٓ */
    public final int f441;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C2730 f442;

    /* JADX INFO: renamed from: ۦۨ */
    public final C2730 f443;

    public C0111(C2730 c2730, C2730 c2731, C4523 c4523, int i, Exception exc) {
        super(exc);
        this.f443 = c2730;
        this.f442 = c2731;
        this.f440 = c4523;
        this.f441 = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List listSingletonList;
        List listM2039;
        StringBuilder sb = new StringBuilder("\n            |Failed to execute op number ");
        sb.append(this.f441);
        sb.append(":\n            |");
        C0156 c0156M1924 = AbstractC0949.m1924(new C3322(this, null));
        if (c0156M1924.hasNext()) {
            Object next = c0156M1924.next();
            if (c0156M1924.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (c0156M1924.hasNext()) {
                    arrayList.add(c0156M1924.next());
                }
                listSingletonList = arrayList;
            } else {
                listSingletonList = Collections.singletonList(next);
            }
        } else {
            listSingletonList = C2340.f7777;
        }
        int size = listSingletonList.size();
        if (50 >= size) {
            listM2039 = AbstractC0973.m2039(listSingletonList);
        } else {
            ArrayList arrayList2 = new ArrayList(50);
            if (listSingletonList instanceof RandomAccess) {
                for (int i = size - 50; i < size; i++) {
                    arrayList2.add(listSingletonList.get(i));
                }
            } else {
                ListIterator listIterator = listSingletonList.listIterator(size - 50);
                while (listIterator.hasNext()) {
                    arrayList2.add(listIterator.next());
                }
            }
            listM2039 = arrayList2;
        }
        sb.append(AbstractC0973.m2056(listM2039, "\n", null, null, null, 62));
        sb.append("\n            ");
        return AbstractC1098.m2325(sb.toString());
    }
}
