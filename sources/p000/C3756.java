package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: ۦٍؑۚؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3756 implements List, InterfaceC3984 {

    /* JADX INFO: renamed from: ۥْ */
    public final int f12503;

    /* JADX INFO: renamed from: ۥٓ */
    public int f12504;

    /* JADX INFO: renamed from: ۦ۟ */
    public final List f12505;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f12506;

    public /* synthetic */ C3756(List list, int i, int i2, int i3) {
        this.f12506 = i3;
        this.f12505 = list;
        this.f12503 = i;
        this.f12504 = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.f12506;
        int i3 = this.f12503;
        List list = this.f12505;
        switch (i2) {
            case 0:
                list.add(i + i3, obj);
                this.f12504++;
                break;
            default:
                list.add(i + i3, obj);
                this.f12504++;
                break;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.f12506;
        int i3 = this.f12503;
        List list = this.f12505;
        switch (i2) {
            case 0:
                list.addAll(i + i3, collection);
                this.f12504 = collection.size() + this.f12504;
                return collection.size() > 0;
            default:
                list.addAll(i + i3, collection);
                int size = collection.size();
                this.f12504 += size;
                return size > 0;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.f12506;
        List list = this.f12505;
        int i2 = this.f12503;
        switch (i) {
            case 0:
                int i3 = this.f12504 - 1;
                if (i2 <= i3) {
                    while (true) {
                        list.remove(i3);
                        if (i3 != i2) {
                            i3--;
                        }
                    }
                }
                this.f12504 = i2;
                break;
            default:
                int i4 = this.f12504 - 1;
                if (i2 <= i4) {
                    while (true) {
                        list.remove(i4);
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                this.f12504 = i2;
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f12506;
        List list = this.f12505;
        int i2 = this.f12503;
        switch (i) {
            case 0:
                int i3 = this.f12504;
                while (i2 < i3) {
                    if (AbstractC3831.m6874(list.get(i2), obj)) {
                        return true;
                    }
                    i2++;
                }
                return false;
            default:
                int i4 = this.f12504;
                while (i2 < i4) {
                    if (AbstractC3831.m6874(list.get(i2), obj)) {
                        return true;
                    }
                    i2++;
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f12506) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f12506;
        int i3 = this.f12503;
        List list = this.f12505;
        switch (i2) {
            case 0:
                AbstractC3667.m6538(i, this);
                break;
            default:
                AbstractC4019.m7192(i, this);
                break;
        }
        return list.get(i + i3);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.f12506;
        List list = this.f12505;
        int i2 = this.f12503;
        switch (i) {
            case 0:
                int i3 = this.f12504;
                for (int i4 = i2; i4 < i3; i4++) {
                    if (AbstractC3831.m6874(list.get(i4), obj)) {
                        return i4 - i2;
                    }
                }
                return -1;
            default:
                int i5 = this.f12504;
                for (int i6 = i2; i6 < i5; i6++) {
                    if (AbstractC3831.m6874(list.get(i6), obj)) {
                        return i6 - i2;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f12506) {
            case 0:
                return this.f12504 == this.f12503;
            default:
                return this.f12504 == this.f12503;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f12506) {
            case 0:
                return new C2519(this, 0, 0);
            default:
                return new C2519(this, 0, 1);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.f12506;
        List list = this.f12505;
        int i2 = this.f12503;
        switch (i) {
            case 0:
                int i3 = this.f12504 - 1;
                if (i2 > i3) {
                    return -1;
                }
                while (!AbstractC3831.m6874(list.get(i3), obj)) {
                    if (i3 == i2) {
                        return -1;
                    }
                    i3--;
                }
                return i3 - i2;
            default:
                int i4 = this.f12504 - 1;
                if (i2 > i4) {
                    return -1;
                }
                while (!AbstractC3831.m6874(list.get(i4), obj)) {
                    if (i4 == i2) {
                        return -1;
                    }
                    i4--;
                }
                return i4 - i2;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f12506) {
            case 0:
                return new C2519(this, 0, 0);
            default:
                return new C2519(this, 0, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.f12506;
        int i2 = this.f12503;
        List list = this.f12505;
        switch (i) {
            case 0:
                int i3 = this.f12504;
                while (i2 < i3) {
                    if (AbstractC3831.m6874(list.get(i2), obj)) {
                        list.remove(i2);
                        this.f12504--;
                        return true;
                    }
                    i2++;
                }
                return false;
            default:
                int i4 = this.f12504;
                while (i2 < i4) {
                    if (AbstractC3831.m6874(list.get(i2), obj)) {
                        list.remove(i2);
                        this.f12504--;
                        return true;
                    }
                    i2++;
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f12506) {
            case 0:
                int i = this.f12504;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                return i != this.f12504;
            default:
                int i2 = this.f12504;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                return i2 != this.f12504;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.f12506;
        int i2 = this.f12503;
        List list = this.f12505;
        switch (i) {
            case 0:
                int i3 = this.f12504;
                int i4 = i3 - 1;
                if (i2 <= i4) {
                    while (true) {
                        if (!collection.contains(list.get(i4))) {
                            list.remove(i4);
                            this.f12504--;
                        }
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                return i3 != this.f12504;
            default:
                int i5 = this.f12504;
                int i6 = i5 - 1;
                if (i2 <= i6) {
                    while (true) {
                        if (!collection.contains(list.get(i6))) {
                            list.remove(i6);
                            this.f12504--;
                        }
                        if (i6 != i2) {
                            i6--;
                        }
                    }
                }
                return i5 != this.f12504;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.f12506;
        int i3 = this.f12503;
        List list = this.f12505;
        switch (i2) {
            case 0:
                AbstractC3667.m6538(i, this);
                break;
            default:
                AbstractC4019.m7192(i, this);
                break;
        }
        return list.set(i + i3, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i;
        int i2;
        switch (this.f12506) {
            case 0:
                i = this.f12504;
                i2 = this.f12503;
                break;
            default:
                i = this.f12504;
                i2 = this.f12503;
                break;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.f12506) {
            case 0:
                AbstractC3667.m6537(this, i, i2);
                return new C3756(this, i, i2, 0);
            default:
                AbstractC4019.m7191(this, i, i2);
                return new C3756(this, i, i2, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f12506) {
            case 0:
                break;
        }
        return AbstractC3925.m7047(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f12506) {
            case 0:
                break;
        }
        return AbstractC3925.m7045(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.f12506) {
            case 0:
                return new C2519(this, i, 0);
            default:
                return new C2519(this, i, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.f12506;
        List list = this.f12505;
        switch (i) {
            case 0:
                int i2 = this.f12504;
                this.f12504 = i2 + 1;
                list.add(i2, obj);
                break;
            default:
                int i3 = this.f12504;
                this.f12504 = i3 + 1;
                list.add(i3, obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.f12506;
        List list = this.f12505;
        switch (i) {
            case 0:
                list.addAll(this.f12504, collection);
                this.f12504 = collection.size() + this.f12504;
                return collection.size() > 0;
            default:
                list.addAll(this.f12504, collection);
                int size = collection.size();
                this.f12504 += size;
                return size > 0;
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.f12506;
        int i3 = this.f12503;
        List list = this.f12505;
        switch (i2) {
            case 0:
                AbstractC3667.m6538(i, this);
                Object objRemove = list.remove(i + i3);
                this.f12504--;
                return objRemove;
            default:
                AbstractC4019.m7192(i, this);
                Object objRemove2 = list.remove(i + i3);
                this.f12504--;
                return objRemove2;
        }
    }
}
