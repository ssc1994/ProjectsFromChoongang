import { createContext, useState } from "react";

const { kakao } = window;

//1. 초기값 카카오
const ListContext = createContext([
    {
        faci_nm: '중앙정보처리학원',
        faci_lat: 37.499668,
        faci_lot: 127.030503
    }
]
)





const ListProvider = ({ children }) => {

    const [list, setList] = useState([
        {
            faci_nm: '종로구',
            faci_lot: 126.9773213,
            faci_lat: 37.59491732
        },
        {
            faci_nm: '중구',
            faci_lot: 126.9959681,
            faci_lat: 37.56014356
        },
        {
            faci_nm: '용산구',
            faci_lot: 126.979907,
            faci_lat: 37.53138497
        },
        {
            faci_nm: '성동구',
            faci_lot: 127.0410585,
            faci_lat: 37.55102969
        },
        {
            faci_nm: '광진구',
            faci_lot: 127.0857435,
            faci_lat: 37.54670608
        },
        {
            faci_nm: '동대문구',
            faci_lot: 127.0548481,
            faci_lat: 37.58195655
        },
        {
            faci_nm: '중랑구',
            faci_lot: 127.0928803,
            faci_lat: 37.59780259
        },
        {
            faci_nm: '성북구',
            faci_lot: 127.0175795,
            faci_lat: 37.6057019
        },
        {
            faci_nm: '강북구',
            faci_lot: 127.011189,
            faci_lat: 37.64347391
        },
        {
            faci_nm: '도봉구',
            faci_lot: 127.0323688,
            faci_lat: 37.66910208
        },
        {
            faci_nm: '노원구',
            faci_lot: 127.0750347,
            faci_lat: 37.65251105
        },
        {
            faci_nm: '은평구',
            faci_lot: 126.9270229,
            faci_lat: 37.61921128
        },
        {
            faci_nm: '서대문구',
            faci_lot: 126.9390631,
            faci_lat: 37.57778531
        },
        {
            faci_nm: '마포구',
            faci_lot: 126.90827,
            faci_lat: 37.55931349
        },
        {
            faci_nm: '양천구',
            faci_lot: 126.8554777,
            faci_lat: 37.52478941
        },
        {
            faci_nm: '강서구',
            faci_lot: 126.822807,
            faci_lat: 37.56123543
        },
        {
            faci_nm: '구로구',
            faci_lot: 126.8563006,
            faci_lat: 37.49440543
        },
        {
            faci_nm: '금천구',
            faci_lot: 126.9008202,
            faci_lat: 37.46056756
        },
        {
            faci_nm: '영등포구',
            faci_lot: 126.9101695,
            faci_lat: 37.52230829
        },
        {
            faci_nm: '동작구',
            faci_lot: 126.9516415,
            faci_lat: 37.49887688
        },
        {
            faci_nm: '관악구',
            faci_lot: 126.9453372,
            faci_lat: 37.46737569
        },
        {
            faci_nm: '서초구',
            faci_lot: 127.0312203,
            faci_lat: 37.47329547
        },
        {
            faci_nm: '강남구',
            faci_lot: 127.0629852,
            faci_lat: 37.49664389
        },
        {
            faci_nm: '송파구',
            faci_lot: 127.115295,
            faci_lat: 37.50561924
        },
        {
            faci_nm: '강동구',
            faci_lot: 127.1470118,
            faci_lat: 37.55045024
        }
    ]);

    const value = {
        state: list,
        action: { setList }
    }


    return (
        <ListContext.Provider value={value}>{children}</ListContext.Provider>
    )
}

//3. Consumer, Provider 반환
const ListConsumer = ListContext.Consumer;

export { ListProvider, ListConsumer };

//기본 export
export default ListContext;