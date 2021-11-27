package com.example.datateman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*

class MyFriendsFragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman() {
        listTeman= ArrayList()
        listTeman.add(
            MyFriend("Samsul Arifin", "Laki - laki", "samsul@stimata.ac.id",
        "088228258622", "Bogor")
        )
        listTeman.add(
            MyFriend("Muhamad Idzam Syahroni", "Laki - Laki","idzamsyahroni14@gmail.com",
        "081827228987","Malang")
        )
        listTeman.add(
            MyFriend("Ayuandani", "Perempuan", "Ayu@gmail.com", "08187645364",
            "Bondowoso")
        )
        listTeman.add(
            MyFriend("Dio Adi Nugroho", "Laki - laki", "dio.adi@gmail.com", "082267587658",
            "Jember")
        )
        listTeman.add(
            MyFriend("Izzatun Nisa", "Perempuan", "izzatun@gmail.com", "089876875645",
            "Malang")
        )
        listTeman.add(
            MyFriend("Siti Nur Maftuhatin", "Perempuan", "siti@gmail.com", "088234215678",
            "Malang")
        )
        listTeman.add(
            MyFriend("Maftuhah Salamatun Ni'mah", "Perempuan", "titis@gmail.com",
            "081235677965", "Malang")
        )
        listTeman.add(
            MyFriend("Fernando Torres", "Laki - laki", "torres@gmail.com",
            "089876898798", "Mexico")
        )
        listTeman.add(
            MyFriend("Lionel Messi", "Laki - laki", "messi@gmail.com",
            "089878453245", "Argentina")
        )
        listTeman.add(
            MyFriend("Cristian Ronaldo", "Laki - laki", "ronaldo@gmail.com",
            "082165787689", "Brazil")
        )
        listTeman.add(
            MyFriend("Ronaldinho", "Laki - laki", "ronal@gmail.com", "08125675567",
            "Brazil")
        )
    }

    private fun tampilTeman() {
        rv_listMyfriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyfriends.adapter=MyFriendAdapter(requireActivity(), listTeman)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}