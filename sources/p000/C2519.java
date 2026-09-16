package p000;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: ۥ۠ؖۥؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2519 implements ListIterator, InterfaceC3984 {

    /* JADX INFO: renamed from: ۥْ */
    public int f8352;

    /* JADX INFO: renamed from: ۦ۟ */
    public final List f8353;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f8354;

    public C2519(List list, int i, int i2) {
        this.f8354 = i2;
        switch (i2) {
            case 1:
                this.f8353 = list;
                this.f8352 = i;
                break;
            default:
                this.f8353 = list;
                this.f8352 = i - 1;
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.f8354;
        List list = this.f8353;
        switch (i) {
            case 0:
                int i2 = this.f8352 + 1;
                this.f8352 = i2;
                list.add(i2, obj);
                break;
            default:
                list.add(this.f8352, obj);
                this.f8352++;
                break;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.f8354;
        List list = this.f8353;
        switch (i) {
            case 0:
                return this.f8352 < list.size() - 1;
            default:
                return this.f8352 < list.size();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f8354) {
            case 0:
                return this.f8352 >= 0;
            default:
                return this.f8352 > 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f8354;
        List list = this.f8353;
        switch (i) {
            case 0:
                int i2 = this.f8352 + 1;
                this.f8352 = i2;
                return list.get(i2);
            default:
                int i3 = this.f8352;
                this.f8352 = i3 + 1;
                return list.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f8354) {
            case 0:
                return this.f8352 + 1;
            default:
                return this.f8352;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f8354;
        List list = this.f8353;
        switch (i) {
            case 0:
                int i2 = this.f8352;
                this.f8352 = i2 - 1;
                return list.get(i2);
            default:
                int i3 = this.f8352 - 1;
                this.f8352 = i3;
                return list.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f8354) {
            case 0:
                return this.f8352;
            default:
                return this.f8352 - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f8354;
        List list = this.f8353;
        switch (i) {
            case 0:
                list.remove(this.f8352);
                this.f8352--;
                break;
            default:
                int i2 = this.f8352 - 1;
                this.f8352 = i2;
                list.remove(i2);
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.f8354;
        List list = this.f8353;
        switch (i) {
            case 0:
                list.set(this.f8352, obj);
                break;
            default:
                list.set(this.f8352, obj);
                break;
        }
    }
}
